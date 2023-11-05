package com.example.recyclerpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        TextView timer = findViewById(R.id.timer);

        new CountDownTimer(3000, 1000) {
            public void onFinish() {
                Intent intent = new Intent(LoadingScreen.this, MainActivity.class);
                startActivity(intent);
            }

            public void onTick(long millisUntilFinished) {
                timer.setText("Segundos restantes: " + millisUntilFinished / 1000);
            }
        }.start();
    }
}