package com.example.fureverdogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Adopt extends AppCompatActivity {
    // Buttons
    private Button homeButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);

        // Connects private variables to buttons in XML
        homeButton = (Button) findViewById(R.id.returnHome_button2);
        profileButton = (Button) findViewById(R.id.userProfile_button1);

        // When the user clicks on the home, it takes them back to the home page
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adopt.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks on the profileButton, it takes them back to the user's profile page
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adopt.this, UserProfile.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
