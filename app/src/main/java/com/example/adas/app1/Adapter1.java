package com.example.adas.app1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adas on 2018-04-09.
 */

public class Adapter1 extends RecyclerView.Adapter {
    private ArrayList<List> list = new ArrayList<>();

    private class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public TextView subtitle;
        public ImageView image;

        public MyViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.title);
            subtitle = v.findViewById(R.id.subtitle);
            image = v.findViewById(R.id.imageAdapter);
        }
    }

    public Adapter1(ArrayList<List> list1){
        list = list1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter1, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        List list1 = list.get(i);
        ((MyViewHolder) viewHolder).title.setText(list1.getTitle());
        ((MyViewHolder) viewHolder).subtitle.setText(list1.getSubtitle());
       // ((MyViewHolder) viewHolder).image.

    }

    @Override
    public int getItemCount() {
        if(list!=null) {
            return list.size();
        }
        return 0;
    }
}
