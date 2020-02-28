package com.example.calcularpromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView textoNombre;
    private TextView textoNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textoNombre = findViewById(R.id.resultadoNombre);
        textoNota = findViewById(R.id.total);


        String nombre = getIntent().getExtras().getString("name");
        String notaFinal = getIntent().getExtras().getString("nota");

        textoNombre.setText("Nota final para " + nombre);
        textoNota.setText("Total: " + notaFinal);

        // Log.e("name", nombre);
    }
}
