package com.example.calcularpromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button registroBtn;
    private EditText nombreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registroBtn= findViewById(R.id.registroBtn);
        nombreText= findViewById(R.id.nombreText);

        registroBtn.setOnClickListener(
                (v) ->{

                    String nombre = nombreText.getText().toString();
                    Intent calificaciones = new Intent(MainActivity.this, Calificaciones.class);
                    calificaciones.putExtra("nombre",nombre);
                    startActivity(calificaciones);

                }
        );

    }
}
