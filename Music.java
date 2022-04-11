package com.sachin.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {
      private Button btn1 ,btn2;
      MediaPlayer mp , mp1;
      int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        btn1= findViewById(R.id.button);
        btn2= findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp =MediaPlayer.create(Music.this ,R.raw.senorita);
                mp1 = MediaPlayer.create(Music.this, R.raw.srivalli);
               btn1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if(mp1 != null && mp1.isPlaying()){
                           mp1.stop();
                       }
                       else {
                           mp.start();
                       }
                   }
               });

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();

                    }
                });
            }
        });
        // next btn



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               btn2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if(mp !=null && mp.isPlaying()){
                         mp.stop();
                       }
                       else {
                           mp1.start();
                       }
                   }
               });

                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }
        });


    }
}