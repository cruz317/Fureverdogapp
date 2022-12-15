package com.example.fureverdogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationAccountInfo extends AppCompatActivity {
    // User will click nextButton once they've finished entering their information
    private Button startButton;

    // User will click returnButton if they changed their mind about creating an account
    private Button returnButton2;

    // User's account information (username, password, email)
    private EditText createUsername, createPass, createEmail;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_account_info);

        startButton = (Button) findViewById(R.id.start_button);

        //mEmail = (EditText) findViewById(R.id.email);
        //mPassword = (EditText) findViewById(R.id.password);

        startButton.setOnClickListener(new View.OnClickListener() {
            //final String email = mEmail.getText().toString();
            //final String password = mPassword.getText().toString();
            //create users with this to DB
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RegistrationAccountInfo.this, MainActivity.class);
                startActivity(intent1);
                finish();
                return;
            }
        });

        returnButton2 = (Button) findViewById(R.id.return_button2);

        // When the user clicks the return_button, the app will take the user back to the login_or_registration screen
        returnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(RegistrationAccountInfo.this, LoginOrRegistration.class);
                startActivity(intent2);
                finish();
                return;
            }
        });
    }

}
