package com.example.fureverdogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginOrRegistration extends AppCompatActivity {

    private EditText userName, password;

    private Button loginButton, registerButton;

    //private Button mLogin,mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_registration);

        userName = (EditText) findViewById(R.id.editTextUserName);
        password = (EditText) findViewById(R.id.editTextPassword);

        loginButton = (Button) findViewById(R.id.login_button);
        registerButton = (Button) findViewById(R.id.register_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            //final String un = userName.getText().toString();
            //final String pw = password.getText().toString();
            // Create users with this to database
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correct
                    Intent intent1 = new Intent(LoginOrRegistration.this, MainActivity.class);
                    startActivity(intent1);
                    finish();
                    return;
                }
                else
                    Toast.makeText(LoginOrRegistration.this, "Login failed", Toast.LENGTH_SHORT).show();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(LoginOrRegistration.this, RegistrationUserInfo.class);
                startActivity(intent2);
                finish();
                return;
            }
        });
        /*
        mLogin = (Button) findViewById(R.id.login);
        mRegister = (Button) findViewById(R.id.register);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrRegistration.this, loginactivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrRegistration.this, Registration.class);
                startActivity(intent);
                finish();
                return;
            }
        });
         */
    }
}