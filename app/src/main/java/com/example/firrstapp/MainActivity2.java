package com.example.firrstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String firstName = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText("bonjour "+firstName);
    }
}