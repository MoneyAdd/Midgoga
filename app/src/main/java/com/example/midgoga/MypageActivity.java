package com.example.midgoga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MypageActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView1,mRecyclerView2,mRecyclerView3,mRecyclerView4,mRecyclerView5;

    private ArrayList<PackageItem> packageList;
    private ArrayList<GuideItem> guideList;
    private ArrayList<ReviewItem> reviewList;

    private Package_ReservationAdapter mRecyclerViewAdapter;
    private Guide_AttentionAdapter mRecyclerViewAdapter2;
    private Review_WentAdapter mRecyclerViewAdapter3;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        firstInit();

        packageList.add(new PackageItem("1", R.drawable.grid1,R.drawable.bookmark_empty));
        packageList.add(new PackageItem("2", R.drawable.grid2,R.drawable.bookmark_empty));
        packageList.add(new PackageItem("3", R.drawable.grid3,R.drawable.bookmark_empty));
        mRecyclerViewAdapter = new Package_ReservationAdapter(packageList);
        mRecyclerView1.setAdapter(mRecyclerViewAdapter);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        mRecyclerView2.setAdapter(mRecyclerViewAdapter);
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        mRecyclerView4.setAdapter(mRecyclerViewAdapter);
        mRecyclerView4.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));



        guideList.add(new GuideItem("1",R.drawable.package_grid1));
        guideList.add(new GuideItem("1",R.drawable.package_grid2));
        guideList.add(new GuideItem("1",R.drawable.package_grid3));
        mRecyclerViewAdapter2 = new Guide_AttentionAdapter(guideList);
        mRecyclerView3.setAdapter(mRecyclerViewAdapter2);
        mRecyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        reviewList.add(new ReviewItem());
        reviewList.add(new ReviewItem());
        mRecyclerViewAdapter3 = new Review_WentAdapter(reviewList);
        mRecyclerView5.setAdapter(mRecyclerViewAdapter3);
        mRecyclerView5.setLayoutManager(new LinearLayoutManager(this));




    }

    public void firstInit(){
        packageList = new ArrayList<>();
        guideList = new ArrayList<>();
        reviewList = new ArrayList<>();

        mRecyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        mRecyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        mRecyclerView3 = (RecyclerView) findViewById(R.id.recyclerView3);
        mRecyclerView4 = (RecyclerView) findViewById(R.id.recyclerView4);
        mRecyclerView5 = (RecyclerView) findViewById(R.id.recyclerView5);
    }

}