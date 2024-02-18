package com.example.textworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new SplashFragment())
                    .commit();
        }

        // Simulate a delay or perform background tasks
        new Handler().postDelayed(() -> {
            // Replace the splash screen with your main content fragment/activity
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new MainFragment())
                    .commit();
        }, 4000); // 2000 milliseconds delay (adjust as needed)
    }
}
