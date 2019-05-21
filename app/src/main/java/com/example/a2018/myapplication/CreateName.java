package com.example.a2018.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateName extends AppCompatActivity {

    EditText name;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide();

        name = (EditText) findViewById(R.id.editText);
        button=(Button)findViewById(R.id.buttongo);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.a2018.myapplication.Main2Activity");
                intent.putExtra("fname", name.getText().toString());
                startActivity(intent);    }
        });


    }
}
