package com.example.midgoga;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class LoginActivity extends AppCompatActivity {

    private TextView mTextView;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceStare) {
        super.onCreate(savedInstanceStare);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_login);
//        stratLoading();
//    }
//    private void stratLoading() {
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                Intent intent = new Intent(MainActivity.this, KakaoActivity.class);
//                startActivity(intent);
//            }
//        }, 3000);


        mProgressBar = findViewById(R.id.progressBar);

        new DownloadTask().execute();    //내부 클래스 실행

    }


    //---------------------------------------------------------------------------------------------------------내부 클래스

    class DownloadTask extends AsyncTask<Void, Integer, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i <= 100; i++){
                try {
                    Thread.sleep(30);                  //0.1초 간격으로 sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                final int percent = i;
                publishProgress(percent);

            }
            Intent intent = new Intent(LoginActivity.this, KakaoActivity.class);
            startActivity(intent);
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            mProgressBar.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }
}