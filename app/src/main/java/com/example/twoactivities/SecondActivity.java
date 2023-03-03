package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities2.extra.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = findViewById(R.id.button_second_1);
        button2 = findViewById(R.id.button_second_2);
        button3 = findViewById(R.id.button_second_3);
        button4 = findViewById(R.id.button_second_4);
        button5 = findViewById(R.id.button_second_5);
        button6 = findViewById(R.id.button_second_6);
        button7 = findViewById(R.id.button_second_7);
        button8 = findViewById(R.id.button_second_8);
        button9 = findViewById(R.id.button_second_9);
        button10 = findViewById(R.id.button_second_10);

    }

    public void returnItem(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        String message1 = button1.getText().toString();
        String message2 = button2.getText().toString();
        String message3 = button3.getText().toString();
        String message4 = button4.getText().toString();
        String message5 = button5.getText().toString();
        String message6 = button6.getText().toString();
        String message7 = button7.getText().toString();
        String message8 = button8.getText().toString();
        String message9 = button9.getText().toString();
        String message10 = button10.getText().toString();

        Intent intentMessage1 = new Intent();
        intentMessage1.putExtra(EXTRA_MESSAGE, message1);

        Intent intentMessage2 = new Intent();
        intentMessage2.putExtra(EXTRA_MESSAGE, message2);

        Intent intentMessage3 = new Intent();
        intentMessage3.putExtra(EXTRA_MESSAGE, message3);

        Intent intentMessage4 = new Intent();
        intentMessage4.putExtra(EXTRA_MESSAGE, message4);

        Intent intentMessage5 = new Intent();
        intentMessage5.putExtra(EXTRA_MESSAGE, message5);

        Intent intentMessage6 = new Intent();
        intentMessage6.putExtra(EXTRA_MESSAGE, message6);

        Intent intentMessage7 = new Intent();
        intentMessage7.putExtra(EXTRA_MESSAGE, message7);

        Intent intentMessage8 = new Intent();
        intentMessage8.putExtra(EXTRA_MESSAGE, message8);

        Intent intentMessage9 = new Intent();
        intentMessage9.putExtra(EXTRA_MESSAGE, message9);

        Intent intentMessage10 = new Intent();
        intentMessage10.putExtra(EXTRA_MESSAGE, message10);



        setResult(RESULT_OK, intentMessage1);
        setResult(RESULT_OK, intentMessage2);
        setResult(RESULT_OK, intentMessage3);
        setResult(RESULT_OK, intentMessage4);
        setResult(RESULT_OK, intentMessage5);
        setResult(RESULT_OK, intentMessage6);
        setResult(RESULT_OK, intentMessage7);
        setResult(RESULT_OK, intentMessage8);
        setResult(RESULT_OK, intentMessage9);
        setResult(RESULT_OK, intentMessage10);

        Log.d(LOG_TAG, intentMessage6.toString());

        finish();
    }
}