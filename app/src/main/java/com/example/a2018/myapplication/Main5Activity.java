package com.example.a2018.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getSupportActionBar().hide();

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();
        String fName = intent.getStringExtra("fname");
        String Location = intent.getStringExtra("Location");

        tvView.setText(fName + Location);
    }
}
