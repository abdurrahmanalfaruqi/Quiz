package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private final int SPLASH_DELAYED = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent moveMain = new Intent(Splash.this, MainActivity.class);
                startActivity(moveMain);
                finish();
            }
        }, SPLASH_DELAYED);
    }
}



