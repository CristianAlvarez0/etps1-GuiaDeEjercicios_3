package sv.edu.utec.ejercicio5_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText edtLado1;
    EditText edtLado2;
    EditText edtLado3;
    Button btnCalcular;
    ImageView imgTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLado1 = findViewById(R.id.edtLado1);
        edtLado2 = findViewById(R.id.edtLado2);
        edtLado3 = findViewById(R.id.edtLado3);
        btnCalcular = findViewById(R.id.btnCalcular);
        imgTriangulo = findViewById(R.id.imgTriangulo);

    }
   public void Operar(View view){
       double lado1Valor = Double.parseDouble(edtLado1.getText().toString());
       double lado2Valor = Double.parseDouble(edtLado2.getText().toString());
       double lado3Valor = Double.parseDouble(edtLado3.getText().toString());

       if (lado1Valor == lado2Valor && lado1Valor == lado3Valor) {
           // Es un triángulo equilátero
           imgTriangulo.setImageResource(R.drawable.triangulo_equilatero);
       } else if (lado1Valor == lado2Valor || lado1Valor == lado3Valor || lado2Valor == lado3Valor) {
           // Es un triángulo isósceles
           imgTriangulo.setImageResource(R.drawable.triangulo_isosceles);
       } else {
           // Es un triángulo escaleno
           imgTriangulo.setImageResource(R.drawable.triangulo_escaleno);
       }


   }


}