package com.example.a2018.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewVegas extends AppCompatActivity {
    TextView tvView;
    String s1 = "Док долго копался в облезшей маталическойаптечке, попутно роняя стеклянные шприцы на пол.\n -Вот же она \n Крикнул Митчелл и кинул курьеру небольшую коробку с красными капсулами.\n -Попробуй найти Виктора, он принес тебя сюда, можешь распросить его тех ребятах которые на тебя напали.\n";
    String s2 = "-Благодарность тут неуместна, это моя профессия. Я сохранил вещи которые были при тебе, возвращаю.\n Попробуй найти Виктора, он принес тебя сюда, можешь распросить его тех ребятах которые на тебя напали.\n";
    String s3 = "Пока Док стирал простыни, курьер собрал свои вещи и начал рыться на полке с припасами, потянув за подозрительную железку, он активировал медвежий капкан, на дикие вопли прибежал Митчелл и раздвинулл стальные челюсти капкана.\n -Парень, угомони свое любопытство! Вижу ты  уже собрался уходить. Навести Виктора, он принес тебя сюда, можешь распросить его тех ребятах которые на тебя напали. \n ";
    String s4 = "-Конечно, парень с куском свинца во лбу заштопал бы себя лучше, чем врач, который солдат ставил на ноги еще до твоего рождения! Если ты такой самостоятельный, сам иди договаривайся с Виктором о помощи, здоровый парень в синем, не спутаешь ни с кем, хоть его поблагодари за спасение.";
    String s5 = "-Негодяев, которые с тобой такое сотворили, я не видел. Попробуй найти Виктора, он принес тебя сюда, может ему будет известно кто это был.";
    String s7 = "-Ты в поcелении 'Гудспрингс' тебя недалеко отсюда и поймали, попроси более подвижного жителя разъяснить тебе здешнюю обстановку,советую навестить Виктора, он принес тебя сюда, можешь распросить его тех ребятах которые на тебя напали.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_vegas);
        getSupportActionBar().hide();

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();
        String fName = intent.getStringExtra("fname");
        String Location = intent.getStringExtra("Location");

        tvView.setText(fName + Location);

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
                        intent.putExtra("Answer", s1);
                        startActivity(intent);
                        break;
                    case R.id.button2:
                        Intent intent1 = new Intent("com.example.a2018.myapplication.NewVegasgo");
                        intent1.putExtra("Answer", s2);
                        startActivity(intent1);
                        break;

                    case R.id.button3:
                        Intent intent2 = new Intent("com.example.a2018.myapplication.NewVegasgo");
                        intent2.putExtra("Answer", s3);
                        startActivity(intent2);
                        break;
                    case R.id.button4:
                        Intent intent3 = new Intent("com.example.a2018.myapplication.NewVegasgo");
                        intent3.putExtra("Answer", s4);
                        startActivity(intent3);
                        break;
                    case R.id.button5:
                        Intent intent4 = new Intent("com.example.a2018.myapplication.NewVegasgo");
                        intent4.putExtra("Answer", s5);
                        startActivity(intent4);
                        break;
                    case R.id.button6:
                        Intent intent5 = new Intent("com.example.a2018.myapplication.NewVegasgo");// потом заменим
                        startActivity(intent5);
                        break;
                    case R.id.button7:
                        Intent intent6 = new Intent("com.example.a2018.myapplication.NewVegasgo");
                        intent6.putExtra("Answer", s7);
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