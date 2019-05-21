package com.example.a2018.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String s1 = " очнулся под золоченой скамьей,обтянутой красной мягкой тканью и лежащей на ней короной.";
    String s2 = " уже часов восемь бредет по темному бескрайнему лесу.";
    String s3 = " подземелье.";
    String s4 = " сказочный мир.";
    String s5 = " погугли про нурсултан.";
    String s6 = " был обычным курьером, выполняя очередную доставку, на него напали бандиты." +
                " После удара по голове, ему запомнился лишь парень в клечатом пиджаке с украденной посылкой и выстрел в лицо..." +
                " Очнувшись в каком-то доме, перед глазами вырисовывается портрет мужчины. Это доктор Митчелл. Он помог нам встать на ноги после тяжелейшего ранения.";
    String s7 = " вечерняя даргора.";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

               Button button,button2,button3,button4,button5,button6,button7;
               button =  (Button)findViewById(R.id.button);
               button2 = (Button)findViewById(R.id.button2);
               button3 = (Button)findViewById(R.id.button3);
               button4 = (Button)findViewById(R.id.button4);
               button5 = (Button)findViewById(R.id.button5);
               button6 = (Button)findViewById(R.id.button6);
               button7 = (Button)findViewById(R.id.button7);
               Intent intent = getIntent();
               final String fName = intent.getStringExtra("fname");







        //    Егор, пожалуйста, разберись в этом
        //    P.S разобрался))
        //    эта фигня работает, но я не придумал для чего её использовать
        //    P.S придумал))

              View.OnClickListener buttdup = new View.OnClickListener() {
              @Override
              public void onClick(View v) {
              switch (v.getId()) {
               case R.id.button:
                  Intent intent = new Intent("com.example.a2018.myapplication.Main5Activity");
                  intent.putExtra("Location", s1);
                   intent.putExtra("fname", fName);
                  startActivity(intent);
                  break;
               case R.id.button2:
                      Intent intent1 = new Intent("com.example.a2018.myapplication.Main5Activity");
                      intent1.putExtra("Location", s2);
                      intent1.putExtra("fname", fName);
                      startActivity(intent1);
                      break;

               case R.id.button3:
                      Intent intent2 = new Intent("com.example.a2018.myapplication.Main5Activity");
                      intent2.putExtra("Location", s3);
                      intent2.putExtra("fname", fName);
                      startActivity(intent2);
                      break;
               case R.id.button4:
                      Intent intent3 = new Intent("com.example.a2018.myapplication.Main5Activity");
                      intent3.putExtra("Location", s4);
                      intent3.putExtra("fname", fName);
                      startActivity(intent3);
                      break;
               case R.id.button5:
                      Intent intent4 = new Intent("com.example.a2018.myapplication.Main5Activity");
                      intent4.putExtra("Location", s5);
                      intent4.putExtra("fname", fName);
                      startActivity(intent4);
                      break;
               case R.id.button6:
                      Intent intent5 = new Intent("com.example.a2018.myapplication.NewVegas");
                      intent5.putExtra("Location", s6);
                      intent5.putExtra("fname", fName);
                      startActivity(intent5);
                      break;
               case R.id.button7:
                      Intent intent6 = new Intent("com.example.a2018.myapplication.Main5Activity");
                      intent6.putExtra("Location", s7);
                      intent6.putExtra("fname", fName);
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

       /*На всякий случай я сохраню эту крутую штуку
        View.OnClickListener goMain4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.a2018.myapplication.Main5Activity");
                startActivity(intent);
            }};
        button .setOnClickListener(goMain4);
        button2.setOnClickListener(goMain4);
        button3.setOnClickListener(goMain4);
        button4.setOnClickListener(goMain4);
        button5.setOnClickListener(goMain4);
        button6.setOnClickListener(goMain4);
        button7.setOnClickListener(goMain4);*/
   }
}