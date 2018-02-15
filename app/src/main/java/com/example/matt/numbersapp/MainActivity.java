package com.example.matt.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void testNumber (View view)
    {
        String message = "";

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        if(usersNumber.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter a valid number.", Toast.LENGTH_LONG).show();
        }else {

            Numbers myNumber = new Numbers();

            myNumber.numberEntered = Integer.parseInt(usersNumber.getText().toString());

            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = myNumber.numberEntered + " is both triangular and square!";
                } else {
                    message = myNumber.numberEntered + " is square, but not triangular.";
                }

            } else {
                message = myNumber.numberEntered + " is neither triangular or square.";
            }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
