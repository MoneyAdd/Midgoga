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

import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

class ReviewAdapter extends BaseAdapter {
    ArrayList<ReviewItem> items = new ArrayList<ReviewItem>();

    @Override
    public int getCount() {
        return items.size();
    }

    public void addItem(ReviewItem item) {
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
        final ReviewItem item = items.get(position);
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.review_gridveiw_item, viewGroup, false);

        return convertView;  //뷰 객체 반환
    }
}