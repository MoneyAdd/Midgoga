package com.example.midgoga;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class VIewPagerAdapter1 extends FragmentPagerAdapter {
    public VIewPagerAdapter1(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return PackageFragment.newInstance();
            case 1:
                return GuideFragment.newInstance();
            case 2:
                return ReviewFragment.newInstance();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "패키지";
            case 1:
                return "가이드";
            case 2:
                return "리뷰";
            default:
                return null;
        }
    }
}
