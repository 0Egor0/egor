package com.example.a2018.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewVegasgo extends AppCompatActivity {
    TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_vegas);
        getSupportActionBar().hide();

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String Answer = intent.getStringExtra("Answer");

        tvView.setText(Answer);

        Button button,button2,button3,button4,button5,button6,button7;
        button =  (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);

        View.OnClickListener buttdup = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        Intent intent = new Intent("com.example.a2018.myapplication.NewVegasgo");

                        startActivity(intent);
                        break;
                    case R.id.button2:
                        Intent intent1 = new Intent("com.example.a2018.myapplication.Main5Activity");

                        startActivity(intent1);
                        break;

                    case R.id.button3:
                        Intent intent2 = new Intent("com.example.a2018.myapplication.Main5Activity");

                        startActivity(intent2);
                        break;
                    case R.id.button4:
                        Intent intent3 = new Intent("com.example.a2018.myapplication.Main5Activity");

                        startActivity(intent3);
                        break;
                    case R.id.button5:
                        Intent intent4 = new Intent("com.example.a2018.myapplication.Main5Activity");

                        startActivity(intent4);
                        break;
                    case R.id.button6:
                        Intent intent5 = new Intent("com.example.a2018.myapplication.NewVegas");

                        startActivity(intent5);
                        break;
                    case R.id.button7:
                        Intent intent6 = new Intent("com.example.a2018.myapplication.Main5Activity");

                        startActivity(intent6);
                        break;

                }
            }
        };
        button.setOnClickListener(buttdup);
        button2.setOnClickListener(buttdup);
        button3.setOnClickListener(buttdup);
        button4.setOnClickListener(buttdup);
        button5.setOnClickListener(buttdup);
        button6.setOnClickListener(buttdup);
        button7.setOnClickListener(buttdup);

    }
}