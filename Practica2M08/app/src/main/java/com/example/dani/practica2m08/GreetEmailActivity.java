package com.example.dani.practica2m08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class GreetEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet_email);

    }


    public void sendToFinalActivity(View view){
        Bundle pasar = getIntent().getExtras();

        EditText editTextCardNumber = (EditText) findViewById(R.id.enter_ur_creditCard);


    }

}
