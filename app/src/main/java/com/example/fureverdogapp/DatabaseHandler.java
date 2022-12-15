package com.example.fureverdogapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String TAG = "DatabasHandler";

    //Database Version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "furever.db";

    //Database Tables
    private static final String DOGS_TABLE_NAME = "dogs";
    private static final String SHELTERS_TABLE_NAME = "shelters";
    private static final String USERFAVS_TABLE_NAME = "userfavs";
    private static final String USERS_TABLE_NAME = "users";

    //Dogs Table Columns
    private static final String DOGS_NAME = "name";
    private static final String DOGS_BREED = "breed";
    private static final String DOGS_SEX = "sex";
    private static final String DOGS_AGE = "age";
    private static final String DOGS_SHELTERID = "shelterId";

    SQLiteDatabase database;

    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DOGS_TABLE_NAME + "( " + DOGS_NAME + " TEXT, dogId INTEGER PRIMARY KEY AUTOINCREMENT, "
        + DOGS_BREED + " TEXT, "+ DOGS_SEX + " TEXT, " + DOGS_AGE + " TEXT, " + DOGS_SHELTERID + " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DOGS_TABLE_NAME);
        onCreate(db);
    }

    public boolean addDog(String addName, String addBreed, String addSex, String addAge, String addShelterId)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DOGS_NAME, addName);
        contentValues.put(DOGS_BREED, addBreed);
        contentValues.put(DOGS_SEX, addSex);
        contentValues.put(DOGS_AGE, addAge);
        contentValues.put(DOGS_SHELTERID, addShelterId);

        Log.d(TAG, "addDog: Adding " + addName + " " + addBreed + " " + addSex + " " +
                        addAge + " " + addShelterId);

        long result = db.insert(DOGS_TABLE_NAME, null, contentValues);

        //If inserted incorrectly will return -1
        if (result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
