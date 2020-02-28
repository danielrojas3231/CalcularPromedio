package com.example.calcularpromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calificaciones extends AppCompatActivity {

    private Button calcularBtn;
    private EditText parcial1;
    private EditText parcial2;
    private EditText taller1;
    private EditText taller2;
    private EditText quicesTeoricos;
    private EditText quicesPracticos;
    private EditText ejercicios;
    private EditText proyectoFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);

        calcularBtn = findViewById(R.id.calcularBtn);
        parcial1 = findViewById(R.id.parcial1);
        parcial2 = findViewById(R.id.parcial2);
        taller1 = findViewById(R.id.taller1);
        taller2 = findViewById(R.id.taller2);
        quicesTeoricos = findViewById(R.id.quicesTeoricos);
        quicesPracticos = findViewById(R.id.quicesPracticos);
        ejercicios = findViewById(R.id.ejercicios);
        proyectoFinal = findViewById(R.id.proyectoFinal);

        String nombre = getIntent().getExtras().getString("nombre");

        calcularBtn.setOnClickListener(

                (v) -> {

                    if (parcial1.getText().toString().equals("") || parcial2.getText().toString().equals("") ||
                            taller1.getText().toString().equals("") || taller2.getText().toString().equals("") ||
                            quicesPracticos.getText().toString().equals("") || quicesTeoricos.getText().toString().equals("") ||
                            ejercicios.getText().toString().equals("") || proyectoFinal.getText().toString().equals("")) {

                        //mensaje falta una nota


                    } else {

                        double notaParcial1 = Double.parseDouble(parcial1.getText().toString()) * 0.15;
                        double notaParcial2 = Double.parseDouble(parcial2.getText().toString()) * 0.15;
                        double notaTaller1 = Double.parseDouble(taller1.getText().toString()) * 0.15;
                        double notaTaller2 = Double.parseDouble(taller2.getText().toString()) * 0.15;
                        double notaQuices1 = Double.parseDouble(quicesTeoricos.getText().toString()) * 0.10;
                        double notaQuices2 = Double.parseDouble(quicesPracticos.getText().toString()) * 0.05;
                        double notaEjercicios = Double.parseDouble(ejercicios.getText().toString()) * 0.05;
                        double notaProyectoFinal = Double.parseDouble(proyectoFinal.getText().toString()) * 0.20;


                        double calculo = notaParcial1 + notaParcial2 + notaTaller1 + notaTaller2 + notaQuices1 + notaQuices2 + notaEjercicios + notaProyectoFinal;


                        String notaFinal = String.valueOf(calculo);

                        Log.e(">>>", notaFinal);

                        Intent resultado = new Intent(Calificaciones.this, Resultado.class);
                        resultado.putExtra("name", nombre);
                        resultado.putExtra("nota", notaFinal);
                        startActivity(resultado);
                    }


                }

        );


    }
}
