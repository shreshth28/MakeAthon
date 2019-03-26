package com.example.shreshth.makeathon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    public static final long SPLASH_TIMER_LENGTH=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent detailsIntent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(detailsIntent);
                finish();
            }
        },SPLASH_TIMER_LENGTH);
    }
}
