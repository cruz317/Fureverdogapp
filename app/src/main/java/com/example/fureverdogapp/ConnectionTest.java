package com.example.fureverdogapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionTest extends AppCompatActivity {

    private Button conTest;
    Connection connect;
    String ConnectionResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection_test);

        conTest = (Button) findViewById(R.id.testButton);
    }

    public void TestConnection(View v)
    {
        TextView tx1 = (TextView) findViewById(R.id.testText);

        try{
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connectionclass();

            if(connect != null)
            {
                String query = "SELECT * FROM dogs";
                Statement st = connect.createStatement();
                ResultSet rs = st.executeQuery(query);

                while(rs.next())
                    tx1.setText(rs.getString(0));
            }
            else
            {
                ConnectionResult= "Check Connection";
            }
        }
        catch(Exception ex)
        {
            Log.e("error", ex.getMessage());
        }
    }
}
