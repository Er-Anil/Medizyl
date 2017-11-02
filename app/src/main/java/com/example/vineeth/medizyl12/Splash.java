package com.example.vineeth.medizyl12;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hadler=new Handler();
        hadler.postDelayed(new Runnable() {
            @Override
            public void run () {
                finish();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        },5000);

    }
}
