package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText editTextValores;
     Button buttonCalcular;
     TextView textViewNegativos, textViewPositivos, textViewMultiplos15, textViewAcumuladorPares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValores = findViewById(R.id.editTextValores);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewNegativos = findViewById(R.id.textViewNegativos);
        textViewPositivos = findViewById(R.id.textViewPositivos);
        textViewMultiplos15 = findViewById(R.id.textViewMultiplos15);
        textViewAcumuladorPares = findViewById(R.id.textViewAcumuladorPares);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados
                String[] valoresString = editTextValores.getText().toString().split(" ");
                int[] valores = new int[10];
                for (int i = 0; i < 10; i++) {
                    valores[i] = Integer.parseInt(valoresString[i]);
                }

                // Obtener la información requerida
                int negativos = 0, positivos = 0, multiplos15 = 0, acumuladorPares = 0;
                for (int valor : valores) {
                    if (valor < 0) {
                        negativos++;
                    } else if (valor > 0) {
                        positivos++;
                    }
                    if (valor % 15 == 0) {
                        multiplos15++;
                    }
                    if (valor % 2 == 0) {
                        acumuladorPares += valor;
                    }
                }

                // Mostrar los resultados
                textViewNegativos.setText("Cantidad de valores negativos: " + negativos);
                textViewPositivos.setText("Cantidad de valores positivos: " + positivos);
                textViewMultiplos15.setText("Cantidad de múltiplos de 15: " + multiplos15);
                textViewAcumuladorPares.setText("Valor acumulado de los números pares: " + acumuladorPares);
            }
        });
    }
}

