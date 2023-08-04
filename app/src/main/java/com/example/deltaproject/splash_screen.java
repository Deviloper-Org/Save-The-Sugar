package com.example.deltaproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //implement splash screen
        startActivity(new Intent(splash_screen.this, HomeActivity.class));
        finish();
    }
}