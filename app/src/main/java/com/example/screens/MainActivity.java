package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<MyCurrentActivity> extends AppCompatActivity {
    Button submit;
    EditText namefield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        submit = findViewById(R.id.my_button);
        namefield = findViewById(R.id.editTextTextPersonName);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, SecondActivity.class);
                intent.putExtra("name", namefield.getText().toString());
                startActivity(intent);

            }
        });
    }

}

