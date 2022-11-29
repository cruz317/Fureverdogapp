package com.example.fureverdogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {

    private Button mLogin;

    private EditText mEmail, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        mLogin = (Button) findViewById(R.id.login);

        mEmail = (EditText) findViewById(R.id.email);
        mPassword = (EditText) findViewById(R.id.password);

        mLogin.setOnClickListener(new View.OnClickListener() {
            //final String email = mEmail.getText().toString();
            //final String password = mPassword.getText().toString();
            //create users with this to DB
            @Override
            public void onClick(View v) {
                if (mEmail.getText().toString().equals("admin") && mPassword.getText().toString().equals("admin")) {
                    //correct
                    Intent intent = new Intent(loginactivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    return;}
                else
                    Toast.makeText(loginactivity.this, "Login failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}