package com.example.calcularpromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String nombre = getIntent().getExtras().getString("name");
        String notaParcial1 = getIntent().getExtras().getString("notaParcial1");
        String notaParcial2 = getIntent().getExtras().getString("notaParcial2");
        String notaTaller1 = getIntent().getExtras().getString("notaTaller1");
        String notaTaller2 = getIntent().getExtras().getString("notaTaller2");
        String notaQuices1 = getIntent().getExtras().getString("notaQuices1");
        String notaQuices2 = getIntent().getExtras().getString("notaQuices2");
        String notaEjercicios = getIntent().getExtras().getString("notaEjercicios");
        String notaProyectoFinal = getIntent().getExtras().getString("notaProyectoFinal");


        // double notaParcial1 = Double.parseDouble("el string chingon");

         Log.e("name",nombre);
    }
}
