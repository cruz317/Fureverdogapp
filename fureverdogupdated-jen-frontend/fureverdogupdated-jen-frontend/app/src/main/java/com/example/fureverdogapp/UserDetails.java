package com.example.fureverdogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserDetails extends AppCompatActivity {
    // Buttons
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        // Connects private variables to buttons in XML
        returnButton = (Button) findViewById(R.id.return_button3);

        // When the user clicks on the returnButton, it takes them back to the user profile page
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserDetails.this, UserProfile.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
