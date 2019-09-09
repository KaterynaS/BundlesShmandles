package com.example.bundlesshmandles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView youReceivedAMessageTextview; //you_received_in_main_textview
    TextView messageTextTextview; //message_received_main_textview

    EditText userInputEditText;
    Button sendButton;

    // Class name for Log tag
    //private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private static final String LOG_TAG = "Main Activity";
    // Unique tag required for the intent extra
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    // Unique tag for the intent reply
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        youReceivedAMessageTextview = findViewById(R.id.you_received_in_main_textview);
        youReceivedAMessageTextview.setVisibility(View.GONE);

        messageTextTextview = findViewById(R.id.message_received_main_textview);
        messageTextTextview.setVisibility(View.GONE);

        userInputEditText = findViewById(R.id.user_input_main_edittext);
        sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get user text
                String input = "";
                input = userInputEditText.getText().toString();

                //send it with a bundle
                Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
                secondActivity.putExtra("key", input);

                //open second activity
                startActivityForResult(secondActivity, TEXT_REQUEST);
            }
        });
    }


    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply =
                        data.getStringExtra("replyKey");
                youReceivedAMessageTextview.setVisibility(View.VISIBLE);
                messageTextTextview.setText(reply);
                messageTextTextview.setVisibility(View.VISIBLE);
                userInputEditText.getText().clear();
                userInputEditText.setHint("hint1");
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
}
