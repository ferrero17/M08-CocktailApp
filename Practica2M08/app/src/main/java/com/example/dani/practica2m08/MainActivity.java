package com.example.dani.practica2m08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_PERSON_NAME = "com.example.hellojohndoe.NAME";
    public final static String EXTRA_PERSON_SURNAME = "com.example.hellojohndoe.SURNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Se llama cuando el usuario hace clic en el botón Enviar */
    public void sendPersonName(View view) {

        EditText editTextPersonName = (EditText) findViewById(R.id.edit_person_name); // Creo objeto tipo Edittext que buscará la variable en la pantalla pasada por parametro
        String personName = editTextPersonName.getText().toString();  // Se guarda en una variable String la variable que queremos guardar.

        Intent intent = new Intent(this, GreetPersonActivity.class);
        intent.putExtra("NAME", personName); // Pasamos por el intent la variable que nos interesa
        startActivity(intent); // Se empieza la siguiente activity con el intent como parametro con todo lo que va a realizar

        EditText editTextPersonSurname = (EditText) findViewById(R.id.edit_person_surname);
        String PersonSurname = editTextPersonName.getText().toString();

       // Intent intent2 = new Intent(this, GreetPersonActivity.class);  --> Cree aquí un segundo Intent2 para probar.
        intent.putExtra(EXTRA_PERSON_SURNAME, PersonSurname);
        startActivity(intent);

    }

}
