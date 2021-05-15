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


public class MainActivity2 extends AppCompatActivity {
    TextView T1;
    TextView T2;
    TextView T3;
    EditText E1;
    Button B;
    MediaPlayer k;
    Integer m =21;
    Integer r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button B = findViewById(R.id.bt1);
        T1 = findViewById(R.id.te1);
        T2 = findViewById(R.id.te2);
        T3 = findViewById(R.id.te3);
        String k = getIntent().getStringExtra("keyname");
        T3.setText(k+"picked: 0");
        m = m-1;
        T2.setText("computer picked :1");
        T1.setText("Matchsticks :"+m.toString());
    }

    // main game function
    public void game(View v){
        play(v);
        E1 = findViewById(R.id.ed1);
        T1 = findViewById(R.id.te1);
        T2 = findViewById(R.id.te2);
        T3 = findViewById(R.id.te3);
        Integer p = 0;
        String s= getIntent().getStringExtra("keyname");
        if(E1.getText().toString().isEmpty()) {
            Toast.makeText(this,"you should enter any number",Toast.LENGTH_SHORT).show();
        }
        else{
            try{
                 p = Integer.parseInt(E1.getText().toString());
            }
            catch (Exception e){
                Toast.makeText(this,"some thing went wrong since this is my first app",Toast.LENGTH_SHORT).show();
            }
        }
        if((p>3) || (p<=0)){
             Toast.makeText(MainActivity2.this, "you should pick 1 or 2 or 3 matchsticks",Toast.LENGTH_SHORT).show();
        }
        else {
            m = m-p;
            T3.setText(s+" picked: "+p.toString());
            T1.setText("Matchsticks :" + m.toString());
            r = m % 4;
            m = m - r;
            T1.setText("Matchsticks :" + m.toString());
            T2.setText("computer picked: " + r.toString());
            if (m == 0) {
                T3.setText("You lost");
                Intent h = new Intent(this,MainActivity4.class);
                startActivity(h);
            }
        }
        E1.setText("");
    }
    public void play(View v){
         k = MediaPlayer.create(this,R.raw.song);
         k.start();
    }

}


