package fisei.mopositastalin_aldazdavid_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

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

    }

    public String Restar(String num1, String num2){
        String result = "";

        return result;
    }

    public void initializeComponents(){
        number1 = findViewById(R.id.ma_etNumber1_sd);
        number2 = findViewById(R.id.ma_etNumber2_sd);
        pot1 = findViewById(R.id.ma_etNumber1_sd);
        pot2 = findViewById(R.id.ma_etNumber2_sd);
        result = findViewById(R.id.ma_etResultr_sd);
    }
}