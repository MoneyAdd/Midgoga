package com.example.midgoga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Guide_AttentionAdapter extends RecyclerView.Adapter<Guide_AttentionAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView_item;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView_item = (ImageView) itemView.findViewById(R.id.img);
        }
    }

    private ArrayList<GuideItem> mList = null;

    public Guide_AttentionAdapter(ArrayList<GuideItem> mList) {
        this.mList = mList;
    }

    // 아이템 뷰를 위한 뷰홀더 객체를 생성하여 리턴
    @NonNull
    @Override
    public Guide_AttentionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.guide_gridview_item, parent, false);
        Guide_AttentionAdapter.ViewHolder vh = new Guide_AttentionAdapter.ViewHolder(view);
        return vh;
    }

    // position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시
    @Override
    public void onBindViewHolder(@NonNull Guide_AttentionAdapter.ViewHolder holder, int position) {
        GuideItem item = mList.get(position);

        holder.imgView_item.setImageResource(item.getImg());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

}