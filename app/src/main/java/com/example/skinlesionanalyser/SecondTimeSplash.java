package com.example.skinlesionanalyser;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class SecondTimeSplash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_second_time_splash);
            Thread timer = new Thread() {
                public void run() {
                    try {
                        sleep(4000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        Intent i = new Intent(SecondTimeSplash.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
            };
            timer.start();
        }
    }



