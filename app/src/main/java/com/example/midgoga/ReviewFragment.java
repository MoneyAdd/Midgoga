package com.example.midgoga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

public class ReviewFragment extends Fragment {
    private GridView gridview ;
    private ReviewAdapter adapter;

    public static ReviewFragment newInstance(){

        ReviewFragment tourlist = new ReviewFragment();
        return tourlist;
    }
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.review_fragment, container, false);

        gridview = (GridView) view.findViewById(R.id.gridview);
        adapter = new ReviewAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new ReviewItem());
        adapter.addItem(new ReviewItem());
        adapter.addItem(new ReviewItem());
        adapter.addItem(new ReviewItem());
        //리스트뷰에 Adapter 설정
        gridview.setAdapter(adapter);

        return view;
    }
}
