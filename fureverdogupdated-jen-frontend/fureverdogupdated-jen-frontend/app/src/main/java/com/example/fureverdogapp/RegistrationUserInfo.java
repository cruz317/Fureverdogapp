package com.example.fureverdogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationUserInfo extends AppCompatActivity {

    // User will click nextButton once they've finished entering their information
    private Button nextButton;

    // User will click returnButton if they changed their mind about creating an account
    private Button returnButton;

    // User's name (first, last)
    private EditText firstName, lastName;

    // User's address information (street, city, zipcode)
    private EditText street, city, zipCode;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_user_info);

        nextButton = (Button) findViewById(R.id.next_button);

        //mEmail = (EditText) findViewById(R.id.email);
        //mPassword = (EditText) findViewById(R.id.password);

        nextButton.setOnClickListener(new View.OnClickListener() {
            //final String email = mEmail.getText().toString();
            //final String password = mPassword.getText().toString();
            //create users with this to DB
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RegistrationUserInfo.this, RegistrationAccountInfo.class);
                startActivity(intent1);
                finish();
                return;
            }
        });

        returnButton = (Button) findViewById(R.id.return_button);

        // When the user clicks the return_button, the app will take the user back to the login_or_registration screen
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(RegistrationUserInfo.this, LoginOrRegistration.class);
                startActivity(intent2);
                finish();
                return;
            }
        });
    }

}
