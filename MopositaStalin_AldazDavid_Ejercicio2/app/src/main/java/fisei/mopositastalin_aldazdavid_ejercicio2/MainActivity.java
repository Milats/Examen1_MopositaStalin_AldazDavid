package fisei.mopositastalin_aldazdavid_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText number1;
    public EditText number2;
    public EditText pot1;
    public EditText pot2;
    public EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();

    }

    public void onClicRestar(View view){
        result.setText(Restar(number1.getText().toString() + "", pot1.getText().toString() + "",
                number2.getText().toString() + "", pot2.getText().toString() + ""));

    }
    public String Restar(String num1, String pot1, String pot2, String num2){
        String result = "";
        String c1 = "";
        String c2 = "";
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);



        return putZeros(num1, pot1);
    }

    public String putZeros(String num, String pot){
        String numero = num;

        for(int x = 0; x < Integer.parseInt(pot); x++){
            numero += "0";
        }
        return numero;
    }
    public void initializeComponents(){
        number1 = findViewById(R.id.ma_etNumber1_sd);
        number2 = findViewById(R.id.ma_etNumber2_sd);
        pot1 = findViewById(R.id.ma_etNumber1_sd);
        pot2 = findViewById(R.id.ma_etNumber2_sd);
        result = findViewById(R.id.ma_etResultr_sd);
    }

    public void onClicEjer1(View view){
        Intent intent = new Intent(this, Ejercicio1.class);
        startActivity(intent);
    }
}