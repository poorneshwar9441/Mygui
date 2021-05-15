package com.example.mygui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;


public class MainActivity extends AppCompatActivity {
    Button B;
    EditText e;
    MediaPlayer m;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void call_activity_2(View v){
        music(v);
        e = findViewById(R.id.e1);

        if(e.getText().toString().isEmpty()){
            Toast.makeText(this,"plz enter a valid name",Toast.LENGTH_SHORT).show();
        }
        else {
            String f = e.getText().toString();
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("keyname", f);
            startActivity(i);
        }
    }

    public void call_activity_3(View V){
        music(V);
        e = findViewById(R.id.e1);
        if(e.getText().toString().isEmpty()){
            Toast.makeText(this,"plz enter a valid name",Toast.LENGTH_SHORT).show();
        }
        else {
            String f = e.getText().toString();
            Intent j = new Intent(this, MainActivity3.class);
            j.putExtra("keyname1", f);
            startActivity(j);
        }
    }

    public void call_activity_4(View v){
        music(v);
        Intent k = new Intent(this,MainActivity4.class);
        startActivity(k);
    }

    public void call_help(View V){
        music(V);
        Intent h = new Intent(this,MainActivity6.class);
        startActivity(h);
    }
    public void music(View v){
        m = MediaPlayer.create(this,R.raw.song);
        m.start();
    }

}