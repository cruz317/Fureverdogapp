package com.example.fureverdogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FavoriteDogs extends AppCompatActivity {
    // nextDogButton shows the next dog that was in their favorites
    private Button nextDogButton;

    // Buttons
    private Button homeButton, adoptButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_dogs);

        // Connects private variables to buttons in XML
        homeButton = (Button) findViewById(R.id.returnHome_button2);
        adoptButton = (Button) findViewById(R.id.adopt_button);
        profileButton = (Button) findViewById(R.id.userProfile_button1);

        // When the user clicks the homeButton, it takes them to the home page
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavoriteDogs.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks on the adoptButton, it takes them to the adopt page
        adoptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavoriteDogs.this, Adopt.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks the profileButton, it takes them to the user's profile
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavoriteDogs.this, UserProfile.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
