package com.example.midgoga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Fragment3 extends Fragment {
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_search_result, container, false);

        ViewPager viewPager = view.findViewById(R.id.viewpager);

        FragmentPagerAdapter fragmentPagerAdapter = new VIewPagerAdapter1(getChildFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        return view;
    }
}
