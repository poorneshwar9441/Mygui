package com.example.mygui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    TextView T1;
    TextView T2;
    TextView T3;
    TextView T4;
    TextView T5;
    TextView T6;
    MediaPlayer k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        T1 = findViewById(R.id.r1);
        T2 = findViewById(R.id.r2);
        T3 = findViewById(R.id.r3);
        T4 = findViewById(R.id.r4);
        T5 = findViewById(R.id.r5);
        T6 = findViewById(R.id.r6);
        T1.setText("1) first you have to choose pick1st or pick2nd option" );
        T2.setText("2) and then pick 1 or 2 or 3 matchsticks and the computer does its picking");
        T3.setText("3) if you pick last you will win the game");
        T4.setText("4) if computer picks Last it will win the game");
        T5.setText("5) number of match sticks the computer picked last is shown left of screen");
        T6.setText("6) number of match sticks the you picked last is shown on right of screen");
    }
    public void go_back(View V){
        play(V);
        Intent m = new Intent(this,MainActivity.class);
        startActivity(m);
    }

    public void play(View v){
        k = MediaPlayer.create(this,R.raw.song);
        k.start();
    }

}