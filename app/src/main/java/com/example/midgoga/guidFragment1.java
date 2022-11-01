package com.example.midgoga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class guidFragment1 extends Fragment {

    public static guidFragment1 newInstance(){
        guidFragment1 guidevaluation = new guidFragment1();  // 이부분은 어뎁터랑 연결 하기 위해서 만든다
        return guidevaluation;
    }

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_guidevaluation, container, false);
        return view;
    }
}
