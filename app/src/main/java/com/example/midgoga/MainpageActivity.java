package com.example.midgoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        String getString = getIntent().getStringExtra("String-keyword");
        int getInt = getIntent().getIntExtra("int-keyword",1);
        boolean getBoolean = getIntent().getBooleanExtra("boolean-keyword",false);
        Log.d("String-keyword", getString);
    }

}