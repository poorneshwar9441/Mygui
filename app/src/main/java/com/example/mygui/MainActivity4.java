package com.example.mygui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    MediaPlayer k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }
    public void call_act_1(View V){
        play(V);
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void play(View v){
        k = MediaPlayer.create(this,R.raw.song);
        k.start();
    }
}