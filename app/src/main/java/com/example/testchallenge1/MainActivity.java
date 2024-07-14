package com.example.testchallenge1;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerUser(View view) {

        // accessing input field data

        EditText firstNameInput = findViewById(R.id.firstNameInput);
        EditText lastNameInput = findViewById(R.id.lastNameInput);
        EditText emailInput = findViewById(R.id.emailInput);

        // targeting output fields

        TextView firstNameView = findViewById(R.id.firstNameView);
        TextView lastNameView = findViewById(R.id.lastNameView);
        TextView emailView = findViewById(R.id.emailView);

        // displaying data

        firstNameView.setText(String.format("First Name : %s", firstNameInput.getText().toString()));
        lastNameView.setText(String.format("Last Name : %s", lastNameInput.getText().toString()));
        emailView.setText(String.format("Email : %s", emailInput.getText().toString()));
        firstNameInput.setText("");
        lastNameInput.setText("");
        emailInput.setText("");
        Toast.makeText(MainActivity.this, "Successfully Register!", Toast.LENGTH_LONG).show();
    }
}