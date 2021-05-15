package com.example.mygui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView T1;
    TextView T2;
    TextView T3;
    EditText E1;
    Integer m = 21;
    Integer p;
    Integer r;
    MediaPlayer k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        E1 = findViewById(R.id.ea1);
        T1 = findViewById(R.id.y1);
        T2 = findViewById(R.id.y2);
        T3 = findViewById(R.id.y3);
        String s = getIntent().getStringExtra("keyname1");
        T1.setText("Matchsticks: "+m.toString());
        T3.setText(s+"picked: 0");
        T2.setText("computer picked : 0");

    }
    public void game1(View v){
        play(v);
        E1 = findViewById(R.id.ea1);
        T1 = findViewById(R.id.y1);
        T2 = findViewById(R.id.y2);
        T3 = findViewById(R.id.y3);
        Intent a = new Intent(this,MainActivity4.class);
        String k = getIntent().getStringExtra("keyname1");
        Integer p =0;
        if(E1.getText().toString().isEmpty()){
            Toast.makeText(this,"plz enter a valid number",Toast.LENGTH_SHORT).show();
        }
        else {
            p = Integer.parseInt(E1.getText().toString());
        }
        if((p>3) || (p<=0)){
            Toast.makeText(MainActivity3.this,"you should pick 1 or 2 or 3 matchsticks",Toast.LENGTH_SHORT).show();
        }
        else{
            m = m-p;
            T3.setText(k+"picked: "+p.toString());
            T1.setText("Matchsticks: "+m.toString());
            if(m==0){

               Intent h = new Intent(this,MainActivity5.class);
               startActivity(h);
            }
            r = m%4;
            if(r==0){
                m =m-1;
                T2.setText("computer picked : 1");
                T1.setText("Matsticks:"+m.toString());
                if(m==0){
                    startActivity(a);
                }
            }
            else{
                m =m-r;
                T2.setText("computer picked:"+r.toString());
                T1.setText("Matchsticks:"+m.toString());
                if(m==0){
                    startActivity(a);
                }
            }

        }
            E1.setText("");
    }
    public void play(View v){
        k = MediaPlayer.create(this,R.raw.song);
        k.start();
    }


}