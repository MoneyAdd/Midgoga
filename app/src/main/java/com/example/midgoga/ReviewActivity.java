package com.example.midgoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class ReviewActivity extends AppCompatActivity {
    private GridView gridview ;
    private ReviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        gridview = (GridView) findViewById(R.id.gridview);
        adapter = new ReviewAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new ReviewItem());
        adapter.addItem(new ReviewItem());
        adapter.addItem(new ReviewItem());
        adapter.addItem(new ReviewItem());
        //리스트뷰에 Adapter 설정
        gridview.setAdapter(adapter);
    }
}