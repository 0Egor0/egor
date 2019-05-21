package com.example.a2018.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
 ImageButton imageButton,imageButton2,imageButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton.setImageResource(R.drawable.gobutt2);
                Intent intent = new Intent("com.example.a2018.myapplication.CreateName");
                startActivity(intent);
            }
        });
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton2.setImageResource(R.drawable.achbutt2);
                Intent intent = new Intent("com.example.a2018.myapplication.Main3Activity");
                startActivity(intent);
            }
        });
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton3.setImageResource(R.drawable.hisbutt2);
                Intent intent = new Intent("com.example.a2018.myapplication.History");
                startActivity(intent);
            }
        });
    }
}
