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

    public void onClickBotonSumar_ALVI(View view){
        String respuesta = Sumar(editText_Valor1.getText().toString(), editText_Valor2.getText().toString());
        tv_Respuesta.setText(respuesta);
    }


    //metodo para la suma
    public static String Sumar(String valor1, String valor2) {
        char[] valor1val = valor1.toCharArray();
        char[] valor2val = valor2.toCharArray();
        Integer mayor = valor1.length();
        if (valor2.length() > valor1.length()) {
            mayor = valor2.length();
        }
        int[] valor1aint = new int[mayor];
        int[] valor2aint = new int[mayor];

        if (valor2.length() != valor1.length()) {
            if (mayor == valor1.length()) {
                int ubicar = mayor - valor2.length();
                int c = 0;
                int i = 0;
                while (i < mayor) {
                    int var = Character.getNumericValue(valor1val[i]);
                    valor1aint[i] = var;
                    i++;
                }
                int cont1 = 0;
                while (cont1 < ubicar) {
                    valor2aint[cont1] = 0;
                    cont1++;
                }
                int cont2 = ubicar;
                while (cont2 < mayor) {
                    int var2 = Character.getNumericValue(valor2val[c]);
                    valor2aint[cont2] = var2;
                    c = c + 1;
                    cont2++;
                }
            } else {
                int cont3 = 0;
                while (cont3 < mayor) {
                    int var3 = Character.getNumericValue(valor2val[cont3]);
                    valor2aint[cont3] = var3;
                    cont3++;
                }

                int ubicar = mayor - valor1.length();
                int c = 0;
                int cont4 = 0;
                while (cont4 < ubicar) {
                    valor1aint[cont4] = 0;
                    cont4++;
                }
                int cont5 = ubicar;
                while (cont5 < mayor) {
                    int var4 = Character.getNumericValue(valor1val[c]);
                    valor1aint[cont5] = var4;
                    c = c + 1;
                    cont5++;
                }

            }

        } else {
            int cont6 = 0;
            while (cont6 < mayor) {
                int var5 = Character.getNumericValue(valor2val[cont6]);
                valor2aint[cont6] = var5;
                cont6++;
            }
            int cont7 = 0;
            while (cont7 < mayor) {
                int var6 = Character.getNumericValue(valor1val[cont7]);
                valor2aint[cont7] = var6;
                cont7++;
            }

        }
        ////////////////
        int suma = 0;
        int auxsuma = 0;
        String aux;
        int[] vectorSuma = new int[mayor];
        int cont8 = (mayor - 1);
        while (cont8 >= 0) {
            suma = auxsuma + valor1aint[cont8] + valor2aint[cont8];
            if (suma >= 10) {
                aux = String.valueOf(suma);
                vectorSuma[cont8] = Integer.valueOf(aux.substring(1));
                auxsuma = 1;
            } else {
                vectorSuma[cont8] = suma;
                auxsuma = 0;
            }
            cont8--;
            suma = 0;
        }
        int cont9 = 0;
        String cadena = "";
        while (cont9 < mayor) {
            cadena = cadena.concat(String.valueOf(vectorSuma[cont9]));
            cont9++;
        }
        return cadena;

    }

}