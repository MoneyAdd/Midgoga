package com.example.midgoga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GuideFragment extends Fragment {
    private GridView gridview ;
    private GuideAdapter adapter;

    public static GuideFragment newInstance(){

        GuideFragment tourlist = new GuideFragment();
        return tourlist;
    }
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.guide_fragment, container, false);

        gridview = (GridView) view.findViewById(R.id.gridview);
        adapter = new GuideAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new GuideItem("1", R.drawable.package_grid1));
        adapter.addItem(new GuideItem("2", R.drawable.package_grid2));
        adapter.addItem(new GuideItem("3", R.drawable.package_grid3));
        adapter.addItem(new GuideItem("4", R.drawable.package_grid4));
        //리스트뷰에 Adapter 설정
        gridview.setAdapter(adapter);

        return view;
    }
}
