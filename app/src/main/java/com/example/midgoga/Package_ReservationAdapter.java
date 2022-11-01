package com.example.midgoga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Package_ReservationAdapter extends RecyclerView.Adapter<Package_ReservationAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView_item;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView_item = (ImageView) itemView.findViewById(R.id.img);
        }
    }

    private ArrayList<PackageItem> mList = null;

    public Package_ReservationAdapter(ArrayList<PackageItem> mList) {
        this.mList = mList;
    }

    // 아이템 뷰를 위한 뷰홀더 객체를 생성하여 리턴
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.package_gridview_item, parent, false);
        Package_ReservationAdapter.ViewHolder vh = new Package_ReservationAdapter.ViewHolder(view);
        return vh;
    }

    // position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시
    @Override
    public void onBindViewHolder(@NonNull Package_ReservationAdapter.ViewHolder holder, int position) {
        PackageItem item = mList.get(position);

        holder.imgView_item.setImageResource(item.getImg());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


}