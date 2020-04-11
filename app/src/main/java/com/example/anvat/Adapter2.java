package com.example.anvat;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anvat.Model.MonAn;

import java.util.ArrayList;

public class Adapter2 extends BaseAdapter {
    ArrayList<MonAn> monAnArrayList;
    static class ViewHolder{
        ImageView img_item_2;
        TextView tv_name_2;
        TextView tv_price_2;
    }

    public Adapter2(ArrayList<MonAn> monAnArrayList) {
        this.monAnArrayList = monAnArrayList;
    }

    @Override
    public int getCount() {
        return monAnArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return monAnArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long)position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.list_item_2, parent, false);

            holder = new ViewHolder();
            holder.tv_name_2 = convertView.findViewById(R.id.tv_name_2);
            holder.tv_price_2 = convertView.findViewById(R.id.tv_price_2);
            holder.img_item_2 = convertView.findViewById(R.id.img_item_2);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        MonAn monAn = monAnArrayList.get(position);
        holder.tv_name_2.setText(monAn.getTenmonan());
        holder.tv_price_2.setText("Giá : " + monAn.getGiamonan());

        Glide
                .with(parent.getContext())
                .load(monAn.getHinhanhmonan())
                .into(holder.img_item_2);

        return convertView;
    }
}
