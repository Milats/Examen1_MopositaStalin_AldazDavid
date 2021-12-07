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
    public String Restar(String num1, String pot1, String num2, String pot2){
        String result = "";
        String c1 = putZeros(num1, pot1);
        String c2 = putZeros(num2, pot2);
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);
        int val1 , val2;
        int cont = 1;
        int resultDigit = 0;
        int limit1 = num1.length() + Integer.parseInt(pot1);
        int limit2 = num2.length() + Integer.parseInt(pot2);
        int limitRes = limit1 - limit2;

        for(int x = 1; x <= limit2; x++){
            val1 = Integer.parseInt(c1.charAt(limit1 - x) + "");
            val2 = Integer.parseInt(c2.charAt(limit2 - x) + "");
            if(val1 < val2){
                resultDigit = (val1 + 10) - val2;
            } else if(val1 == 0 && val2 != 0){
                resultDigit =  10 - val2;
            } else if (val1 > val2){
                resultDigit = val1 - val2;
            } else if(val1 == val2){
                resultDigit = 0;
            }
            result = resultDigit + result + "";
            cont++;
        }
        for(int x = 0; x < limitRes; x++){
            result = c1.charAt(x) + result + "";
        }
        return result;
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
        pot1 = findViewById(R.id.ma_etPot1_sd);
        pot2 = findViewById(R.id.ma_etPot2_sd);
        result = findViewById(R.id.ma_etResultr_sd);
    }

    public void onClicEjer1(View view){
        Intent intent = new Intent(this, Ejercicio1.class);
        startActivity(intent);
    }
}