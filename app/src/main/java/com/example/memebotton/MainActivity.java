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
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1Id);
        button2 = findViewById(R.id.button2Id);
        button3 = findViewById(R.id.button3Id);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1Id:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.queota);
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
