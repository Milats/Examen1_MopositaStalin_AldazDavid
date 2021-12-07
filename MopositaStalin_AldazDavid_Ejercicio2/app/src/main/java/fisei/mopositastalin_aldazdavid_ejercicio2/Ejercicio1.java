package fisei.mopositastalin_aldazdavid_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {


    private EditText editText_Valor1;
    private EditText editText_Valor2;
    private TextView tv_Respuesta;

    private Button button_Resta;
    private Button button_Suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        editText_Valor1 = findViewById(R.id.editTextValor1);
        editText_Valor2 = findViewById(R.id.editTextValor2);
        tv_Respuesta = findViewById(R.id.textViewRespueta);
        button_Suma = findViewById(R.id.buttonSuma);

    }

    public void onClickBotonSumar(View view){
        String respuesta = Sumar(editText_Valor1.getText().toString(), editText_Valor2.getText().toString());
        tv_Respuesta.setText(respuesta);
    }


    //metodo para la suma
    private static String Sumar(String s1, String s2) {

        if(s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int cha = s2.length() - s1.length();
        for(int i=0; i<cha; i++) {
            s1 = '0' + s1;
        }
        String result = "";
        int w = 0;

        for(int i=s2.length()-1; i>=0; i--) {

            int c = s2.charAt(i) + s1.charAt(i) - 96 + w;
            w = c / 10;
            result = (c%10) + result;
        }

        if(w == 1) result = 1 + result;
        return result;
    }
}