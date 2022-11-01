package com.example.midgoga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PackageFragment extends Fragment {
    private GridView gridview ;
    private PackageAdapter adapter;

    public static PackageFragment newInstance(){

        PackageFragment tourlist = new PackageFragment();
        return tourlist;
    }
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.package_fragment, container, false);

        gridview = (GridView) view.findViewById(R.id.gridview);
        adapter = new PackageAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new PackageItem("1",R.drawable.grid1, R.drawable.bookmark_empty));//R.drawable.bookmark_empty를 하는 이뉴는 이렇게 하지 않으면 북마크를 클릭했을때 맨 마지막 북마크가 변경된다.
        adapter.addItem(new PackageItem("2",R.drawable.grid2, R.drawable.bookmark_empty));
        adapter.addItem(new PackageItem("3",R.drawable.grid3, R.drawable.bookmark_empty));
        adapter.addItem(new PackageItem("4",R.drawable.grid4, R.drawable.bookmark_empty));
        adapter.addItem(new PackageItem("5",R.drawable.grid5, R.drawable.bookmark_empty));
        adapter.addItem(new PackageItem("6",R.drawable.grid6, R.drawable.bookmark_empty));
        //리스트뷰에 Adapter 설정
        gridview.setAdapter(adapter);

        return view;
    }
}
