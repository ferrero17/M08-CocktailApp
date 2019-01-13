package com.example.dani.practica2m08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class GreetPersonActivity extends AppCompatActivity {
    public final static String EXTRA_PERSON_EMAIL = "com.example.hellojohndoe.EMAIL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet_person);

        Intent intent = getIntent();
        String personName = intent.getStringExtra(MainActivity.EXTRA_PERSON_NAME);
        String personSurname = intent.getStringExtra(MainActivity.EXTRA_PERSON_SURNAME);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("HELLO " + personName +"SURNAME: " + personSurname);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_greet_person);
        layout.addView(textView);
    }


    public void sendEmail_phone(View view) {

        EditText editTextPerson_phone=(EditText) findViewById(R.id.enter_ur_email);
        String Person_phone = editTextPerson_phone.getText().toString();

        Bundle pasar = getIntent().getExtras();
        //String personName = pasar.getString("NAME");
        Intent intent = new Intent (this, GreetEmailActivity.class);
        intent.putExtra("phone", Person_phone);

        intent.putExtras(pasar);
        //intent.putExtra("NAME", personName);
        startActivity(intent);





    }





}