package com.andigeeky.constraintlayoutexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when user tap on send button
     *
     * @param view instance of Button
     */
    public void sendMessage(View view) {
        String message = ((EditText) findViewById(R.id.edt_name)).getText().toString();
        Intent intent = new Intent();
        intent.putExtra(KEY_MESSAGE, message);
        startActivity(intent);
    }
}
