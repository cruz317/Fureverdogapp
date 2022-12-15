package com.example.fureverdogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    private Button mRegister;

    private EditText mEmail, mPassword;

    DatabaseHandler mDatabaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mDatabaseHandler = new DatabaseHandler(this);
        mRegister = (Button) findViewById(R.id.register);

        mEmail = (EditText) findViewById(R.id.email);
        mPassword = (EditText) findViewById(R.id.password);

        mRegister.setOnClickListener(new View.OnClickListener() {
            final String email = mEmail.getText().toString();
            final String password = mPassword.getText().toString();
            //create users with this to DB
            @Override
            public void onClick(View v) {


                mDatabaseHandler.addUser(email, password);

                Intent intent = new Intent(Registration.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}