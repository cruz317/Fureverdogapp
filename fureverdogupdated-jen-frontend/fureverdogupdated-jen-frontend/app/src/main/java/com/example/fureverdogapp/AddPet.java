package com.example.fureverdogapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

public class AddPet extends AppCompatActivity {


    // Buttons
    private Button returnHomeButton, addPetButton, galleryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pet);

        // Connects private variables to buttons in XML
        returnHomeButton = (Button) findViewById(R.id.returnHome_button1);
        addPetButton = (Button) findViewById(R.id.createPet_button);
        galleryButton = (Button) findViewById(R.id.chooseImage_button);

        // When the user clicks the returnHomeButton, it takes them to the home page
        returnHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPet.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks the addPetButton, it adds the pet into the SQL and takes them back to the home page
        addPetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPet.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        // When the user clicks the galleryButton, it opens the phone's camera roll and allows the user to select a photo
        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPet.this, AddPet.class);
                //startActivityForResult(intent, 3);
            }
        });
    }

    // This part is not functional. Trying to get the galleryButton to take user to gallery
    /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            ImageView imageView = findViewById(R.id.dogImage);
            imageView.setImageURI(selectedImage);
        }
    }
     */
}
