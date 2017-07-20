package com.andigeeky.constraintlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getExtras().getString(MainActivity.KEY_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.lbl_txt_message);
        textView.setText(message);
    }
}
