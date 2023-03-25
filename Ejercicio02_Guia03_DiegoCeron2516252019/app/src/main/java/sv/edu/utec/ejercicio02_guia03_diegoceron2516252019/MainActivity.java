package sv.edu.utec.ejercicio02_guia03_diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtNum;
TextView tvRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcular(View view){
        edtNum=findViewById(R.id.edtNumero);
        tvRes=findViewById(R.id.tvResultado);
        int numero=Integer.parseInt(edtNum.getText().toString());
        if(numero<10){
            tvRes.setText("El número es de una cifra");
        }
        else if (numero<100){
            tvRes.setText("El número es de dos cifras");
        }
        else if (numero<1000){
            tvRes.setText("El número es de tres cifras");
        }
        else
        {
            tvRes.setText("Error! el número sobrepasa el tamaño");
        }
    }
}