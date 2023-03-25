package sv.edu.utec.ejercicio03_guia03_diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Button btnEn;
int con=0,acum=0;
EditText edtNum;
TextView tvNums,tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEn=findViewById(R.id.btnEnviar);
        tvNums=findViewById(R.id.tvNumeros);
        tvRes=findViewById(R.id.tvResultado);

        for(int i=0;i<10;i++){
            btnEn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(con<10){
                        edtNum=findViewById(R.id.edtNumero);
                        if(con>4){
                            acum=acum+Integer.parseInt(edtNum.getText().toString());
                        }
                        if(con<9)
                        {
                            tvNums.append(edtNum.getText()+",");
                        }
                        else{
                            tvNums.append(edtNum.getText());
                        }
                        con++;
                    }
                    tvRes.setText("La suma es: "+String.valueOf(acum));
                }
            });
        }
    }
}