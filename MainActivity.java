package com.sachin.myfirstapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    EditText e1,e2;
    Button b1;
    String s1,s2;
    TextToSpeech ts = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        b1=findViewById(R.id.login);
        ts= new TextToSpeech(MainActivity.this,this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                String t= "Vishal Login";
                String s3 = t.toString();
                String t1= "Register here";
                String s4 = t1.toString();
                if(s1.contentEquals("vishal") && s2.contentEquals("1234")){
                    Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                    ts.speak(s3,TextToSpeech.QUEUE_ADD,null,null);

                }else{
                    Toast.makeText(MainActivity.this, "Not login", Toast.LENGTH_SHORT).show();
                    ts.speak(s4,TextToSpeech.QUEUE_ADD,null,null);
                }



            }
        });
    }
    @Override
    public void onInit(int i) {
        ts.setLanguage(Locale.ENGLISH);
        ts.setSpeechRate(0.8f);
    }


  /*
    EditText e1;
    Button b1;
    String s1;
    TextToSpeech ts;

    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= findViewById(R.id.edit1);
        b1 = findViewById(R.id.click);
        ts= new TextToSpeech(MainActivity.this,this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "this is sachin ", Toast.LENGTH_LONG).show();
                s1= e1.getText().toString();
                ts.speak(s1,TextToSpeech.QUEUE_ADD , null);
            }
        });
    }

    @Override
    public void onInit(int i) {
       ts.setLanguage(Locale.ENGLISH);
       ts.setSpeechRate(0.8f);

    }



 Button b1,b2 ;
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.login);
        b2 = findViewById(R.id.register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " this is sachin ", Toast.LENGTH_LONG).show();
            }
        });
    }*/

    }