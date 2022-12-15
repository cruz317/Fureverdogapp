package com.example.fureverdogapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class dbTest extends AppCompatActivity {

    DatabaseHandler mDatabaseHandler;
    private EditText mName, mBreed, mSex, mAge, mShelterId;
    private Button mInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbtest);

        mDatabaseHandler = new DatabaseHandler(this);

        mName = (EditText) findViewById(R.id.name);
        mBreed = (EditText) findViewById(R.id.breed);
        mSex = (EditText) findViewById(R.id.sex);
        mAge = (EditText) findViewById(R.id.age);
        mShelterId = (EditText) findViewById(R.id.shelterId);
        mInsert = (Button) findViewById(R.id.insert);

        mInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName = mName.getText().toString();
                String getBreed = mBreed.getText().toString();
                String getSex = mSex.getText().toString();
                String getAge = mAge.getText().toString();
                String getShelterId = mShelterId.getText().toString();

                mDatabaseHandler.addDog(getName, getBreed, getSex, getAge, getShelterId);

            }
        });



    }
}
