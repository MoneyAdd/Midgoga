package com.example.midgoga;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

class GuideAdapter extends BaseAdapter {
    ArrayList<GuideItem> items = new ArrayList<GuideItem>();
    @Override
    public int getCount() {
        return items.size();
    }

    public void addItem(GuideItem item) {
        items.add(item);
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        final GuideItem item = items.get(position);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.guide_gridview_item, viewGroup, false);

            ImageView img = (ImageView) convertView.findViewById(R.id.img);
            ImageView flag = (ImageView) convertView.findViewById(R.id.flag);//이미지를 비교하기 위해 생성

            img.setImageResource(item.getImg());
            //Log.d("테스트", "getView() - [ "+position+" ] "+bearItem.getBookmark());

        } else {
            View view = new View(context);
            view = (View) convertView;
        }
        View tmp= convertView;
        //각 아이템 선택 event


        return convertView;  //뷰 객체 반환
    }
}