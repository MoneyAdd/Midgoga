package com.example.midgoga;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Fragment2 extends Fragment {
    View view;
    SearchView searchView;

    LinearLayout linear;
    TextView text_result, text_x;
    String result_data;
    String flag;//주소다음 내용을 적기위한 flag
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_search, container, false);

        ViewPager viewPager = view.findViewById(R.id.viewpager);

        FragmentPagerAdapter fragmentPagerAdapter = new VIewPagerAdapter1(getChildFragmentManager());

        TabLayout tabLayout = view.findViewById(R.id.tab_lay);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        search();
        ////////////////////
        text_result = view.findViewById(R.id.text_result);
        linear = view.findViewById(R.id.linear);
        text_x = view.findViewById(R.id.text_x);
        text_x.setOnClickListener(v -> {
            linear.setVisibility(View.GONE);
        });
        return view;
    }
    void search(){
        searchView = view.findViewById(R.id.serchview);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            //검색버튼을 눌렀을 경우
            @Override
            public boolean onQueryTextSubmit(String query) {
                linear.setVisibility(View.VISIBLE);
                text_result.setText("검색 중입니다......");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // TODO Auto-generated method stub

                        // 아래 메소드를 호출하여 XML data를 파싱해서 String 객체로 얻어오기
                        // 날씨 API

                        // 건축물 API
                        result_data = getHomeXmlData(query);

                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // TODO Auto-generated method stub
                                text_result.setText(result_data); //TextView에 문자열  data 출력
                            }
                        });
                    }
                }).start(); //TextView에 문자열  data 출력
                return true;
            }

            //텍스트가 바뀔때마다 호출
            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });
        //x버튼 누를때 이벤트
        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                return true;
            }
        });
    }
    String getHomeXmlData(String place) {
        StringBuffer buffer = new StringBuffer();

        String crsKorNm = place;

        String queryUrl = "http://apis.data.go.kr/B551011/Durunubi/courseList?serviceKey=1cs1Yg9y53Re2VJzr9bio5KwVJqXyQw61rSvVyTeooUcpR0dLPYj5H4fc54tGsIy%2BaN03yDvej7EeaKVDI6SPQ%3D%3D&numOfRows=99&MobileOS=ETC&MobileApp=AppTest&crsKorNm="+crsKorNm;

        try {
            URL url = new URL(queryUrl);//문자열로 된 요청 url을 URL 객체로 생성.
            InputStream is = url.openStream(); //url위치로 입력스트림 연결

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8")); //inputstream 으로부터 xml 입력받기

            String tag;
            xpp.next();
            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();//태그 이름 얻어오기


                        if (tag.equals("crsKorNm")) {
                            buffer.append("코스명: ");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n\n");
                        }
                        if (tag.equals("crsContents")) {
                            xpp.next();
                            flag=xpp.getText();//주소 뒤에 붙임
                        }
                        if (tag.equals("sigun")) {
                            buffer.append("주소: ");
                            xpp.next();

                            buffer.append(xpp.getText());
                            buffer.append("\n\n");

                            buffer.append("내용: ");
                            buffer.append(flag);
                            buffer.append("\n\n");
                        }


                        break;
                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();
                        if (tag.equals("item")){ buffer.append("\n");buffer.append("\n");}
                        break;
                }
                eventType = xpp.next();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch blocke.printStackTrace();
        }
        return buffer.toString();//StringBuffer 문자열 객체 반환
    }
}
