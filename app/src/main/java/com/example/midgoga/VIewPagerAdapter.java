package com.example.midgoga;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VIewPagerAdapter extends FragmentPagerAdapter {
    public VIewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return PackageFragment.newInstance();
            case 1:
                return PackageFragment.newInstance();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "가이드 패키지";
            case 1:
                return "가이드평가";
            default:
                return null;
        }
    }
}
