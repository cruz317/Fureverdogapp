package com.example.fureverdogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity {
    // Buttons
    private Button accountDetailsButton, favoritesButton, returnHomeButton, signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        // Connects private variables to buttons in XML
        accountDetailsButton = (Button) findViewById(R.id.userAccountDetails_button);
        favoritesButton = (Button) findViewById(R.id.favoriteDogs_button);
        returnHomeButton = (Button) findViewById(R.id.home_button);
        signOutButton = (Button) findViewById(R.id.signOut_button);

        // When the user clicks the accountDetailsButton, it takes them to the user details page
        accountDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, UserDetails.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks on the favoritesButton, it takes them to the favorites page (with all the liked dogs)
        favoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, FavoriteDogs.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks the returnHomeButton, it takes them to the home page
        returnHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks the signOutButton, it takes them to the login page
        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, LoginOrRegistration.class);
                startActivity(intent);
                finish();
                return;
            }
        });

    }
}
