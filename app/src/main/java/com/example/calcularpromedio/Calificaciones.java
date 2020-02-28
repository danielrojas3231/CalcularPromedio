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

        Log.e(">>>",nombre);

        //double doble = Double.parseDouble("el string chingon");

        calcularBtn.setOnClickListener(

                (v) ->{

                    String notaParcial1 = parcial1.getText().toString();
                    String notaParcial2 = parcial2.getText().toString();
                    String notaTaller1 = taller1.getText().toString();
                    String notaTaller2 = taller2.getText().toString();
                    String notaQuices1 = quicesTeoricos.getText().toString();
                    String notaQuices2 = quicesPracticos.getText().toString();
                    String notaEjercicios = ejercicios.getText().toString();
                    String notaProyectoFinal = proyectoFinal.getText().toString();

                    Intent resultado = new Intent(Calificaciones.this,Resultado.class);
                    resultado.putExtra("name",nombre);
                    resultado.putExtra("notaParcial1",notaParcial1);
                    resultado.putExtra("notaParcial2",notaParcial2);
                    resultado.putExtra("notaTaller1",notaTaller1);
                    resultado.putExtra("notaTaller2",notaTaller2);
                    resultado.putExtra("notaQuices1",notaQuices1);
                    resultado.putExtra("notaQuices2",notaQuices2);
                    resultado.putExtra("notaEjercicios",notaEjercicios);
                    resultado.putExtra("notaProyectoFinal",notaProyectoFinal);

                    startActivity(resultado);
                }

        );


    }
}
