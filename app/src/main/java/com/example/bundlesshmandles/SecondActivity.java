package com.example.bundlesshmandles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText userReplyEdittext;
    Button replyButton;
    TextView messageTextTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra("key");
        messageTextTextView = findViewById(R.id.message_text_in_second_textview);
        messageTextTextView.setText(message);

        userReplyEdittext = findViewById(R.id.enter_reply_edittext);
        replyButton = findViewById(R.id.reply_button);

        userReplyEdittext.getText().clear();
        userReplyEdittext.setHint("hint");

        replyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnReply(view);
            }
        });
    }


    public void returnReply(View view) {
        String reply = userReplyEdittext.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra("replyKey", reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
