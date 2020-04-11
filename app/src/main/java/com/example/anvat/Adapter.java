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

public class Adapter extends BaseAdapter {
    ArrayList<MonAn> monAnArrayList;
    static class ViewHolder{
        ImageView img_item;
        TextView tv_name;
        TextView tv_price;
    }

    public Adapter(ArrayList<MonAn> monAnArrayList) {
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
            convertView = layoutInflater.inflate(R.layout.list_item, parent, false);

            holder = new ViewHolder();
            holder.tv_name = convertView.findViewById(R.id.tv_name);
            holder.tv_price = convertView.findViewById(R.id.tv_price);
            holder.img_item = convertView.findViewById(R.id.img_item);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        MonAn monAn = monAnArrayList.get(position);
        holder.tv_name.setText(monAn.getTenmonan());
        holder.tv_price.setText("Giá : " + monAn.getGiamonan());

        Glide
                .with(parent.getContext())
                .load(monAn.getHinhanhmonan())
                .into(holder.img_item);

        return convertView;
    }
}
