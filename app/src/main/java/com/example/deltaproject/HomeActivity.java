package com.example.deltaproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button start_btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        start_btn = findViewById(R.id.play_btn);

        start_btn.setOnClickListener(v -> {
            Intent intent = new Intent( HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });


    }
}