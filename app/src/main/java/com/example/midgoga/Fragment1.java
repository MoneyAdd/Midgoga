package com.example.midgoga;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class Fragment1 extends Fragment {

    View view;
    DotsIndicator dotsIndicator;
    TextView text_pkg1,text_pkg2,text_pkg3,text_pkg4,text_pkg5;
    TextView text_guide1,text_guide2,text_guide3,text_guide4,text_guide5;
    TextView title;
    ImageView img_profil;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_page, container, false);


        ViewPager pager = view.findViewById(R.id.pager);
        pager.setNestedScrollingEnabled(true);//스크롤뷰랑 중첩되는거 방지. 근데 이거 없어도 됨
        pager.setOffscreenPageLimit(3); //3개까지 caching. 근데 이거 왜있는지 모르겠음

        MainPagerAdapter adapter = new MainPagerAdapter(getChildFragmentManager(), 1);

        ImageFragment1 imageFragment1 = new ImageFragment1();
        adapter.addItem(imageFragment1);
        ImageFragment1 imageFragment2 = new ImageFragment1();
        adapter.addItem(imageFragment2);
        ImageFragment1 imageFragment3 = new ImageFragment1();
        adapter.addItem(imageFragment3);
        ImageFragment1 imageFragment4 = new ImageFragment1();
        adapter.addItem(imageFragment4);

        pager.setAdapter(adapter);

        dotsIndicator = (DotsIndicator) view.findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(pager);

        textSet();

        return view;


    }
    private void textSet() {
        text_pkg1=view.findViewById(R.id.text_pkg1);
        text_pkg2=view.findViewById(R.id.text_pkg2);
        text_pkg3=view.findViewById(R.id.text_pkg3);
        text_pkg4=view.findViewById(R.id.text_pkg4);
        text_pkg5=view.findViewById(R.id.text_pkg5);

        img_profil = view.findViewById(R.id.img_profil);

        text_guide1=view.findViewById(R.id.text_guide1);
        text_guide2=view.findViewById(R.id.text_guide2);
        text_guide3=view.findViewById(R.id.text_guide3);
        text_guide4=view.findViewById(R.id.text_guide4);
        text_guide5=view.findViewById(R.id.text_guide5);
        title = view.findViewById(R.id.title);

        text_pkg1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),PackageActivity.class);
            startActivity(intent);
        });
        text_pkg2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),PackageActivity.class);
            startActivity(intent);
        });
        text_pkg3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),PackageActivity.class);
            startActivity(intent);
        });
        text_pkg4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),PackageActivity.class);
            startActivity(intent);
        });
        text_pkg5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),PackageActivity.class);
            startActivity(intent);
        });

        img_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MypageActivity.class);
                startActivity(intent);
            }
        });

        text_guide1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),GuideActivity.class);
            startActivity(intent);
        });
        text_guide2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),GuideActivity.class);
            startActivity(intent);
        });
        text_guide3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),GuideActivity.class);
            startActivity(intent);
        });
        text_guide4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),GuideActivity.class);
            startActivity(intent);
        });
        text_guide5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),GuideActivity.class);
            startActivity(intent);
        });

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getActivity(), Review.class);
                startActivity(intent);
            }
        });
    }
}
