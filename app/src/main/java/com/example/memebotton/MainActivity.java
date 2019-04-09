package com.example.memebotton;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1Id);
        button2 = findViewById(R.id.button2Id);
        button3 = findViewById(R.id.button3Id);
        button4 = findViewById(R.id.button4Id);
        button5 = findViewById(R.id.button5Id);
        button6 = findViewById(R.id.button6Id);
        button7 = findViewById(R.id.button7Id);
        button8 = findViewById(R.id.button8Id);
        button9 = findViewById(R.id.button9Id);
        button10 = findViewById(R.id.button10Id);
        button11 = findViewById(R.id.button11Id);
        button12 = findViewById(R.id.button12Id);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.queota);
                tocaSom();
                break;
            case R.id.button2Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.izi);
                tocaSom();
                break;
            case R.id.button3Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.onooo);
                tocaSom();
                break;
            case R.id.button4Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ocrab);
                tocaSom();
                break;
            case R.id.button5Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ctwin);
                tocaSom();
                break;
            case R.id.button6Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.terwin);
                tocaSom();
                break;
            case R.id.button7Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.bombdef);
                tocaSom();
                break;
            case R.id.button8Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.bombpl);
                tocaSom();
                break;
            case R.id.button9Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato1);
                tocaSom();
                break;
            case R.id.button10Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato2);
                tocaSom();
                break;
        }


    }

    public void tocaSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();

        }
    }

}
