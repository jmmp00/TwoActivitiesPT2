package com.example.twoactivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities2.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent1 = getIntent();
        String message1 = intent1.getStringExtra(SecondActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_header_reply1);
        textView.setText(message1);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, textView.toString());

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

       // if (mReplyHeadTextView.getVisibility() == View.VISIBLE) {
         //   outState.putBoolean("reply_visible", true);
           // outState.putString("reply_text",mReplyTextView.getText().toString());
        //}
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "'Choose Items' button clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //if (requestCode == TEXT_REQUEST) {
          //  if (resultCode == RESULT_OK) {
            //    String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
              //  mReplyHeadTextView.setVisibility(View.VISIBLE);

                //mReplyTextView.setText(reply);
                //mReplyTextView.setVisibility(View.VISIBLE);
           // }
     //   }
    }
}