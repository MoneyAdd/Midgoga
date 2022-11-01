package com.example.midgoga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomnavi);




        getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, new Fragment1()).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, new Fragment1()).commitAllowingStateLoss();

                        break;
                    case R.id.serch:
                        Log.d("test", " test");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, new Fragment2()).commitAllowingStateLoss();
                        break;


                    case R.id.option:
                        Log.d("test2", " test2");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, new Fragment4()).commitAllowingStateLoss();
                }
                return true;
            }
        });


    }
}