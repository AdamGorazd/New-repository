package com.example.adas.app1.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adas.app1.Classes.Item;
import com.example.adas.app1.Interface.OnItemListListener;
import com.example.adas.app1.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Adas on 2018-04-09.
 */

public class ItemListAdapter extends RecyclerView.Adapter {
    private ArrayList<Item> list = new ArrayList<>();
    private OnItemListListener onItemListListener;

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

        public void fillData(final Item item, final OnItemListListener onItemListListener)
        {
            title.setText(item.getTitle());
            subtitle.setText(item.getSubtitle());
            Picasso.with(itemView.getContext()).load(item.getImage()).placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(image);

            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemListListener.onItemClick(item, getAdapterPosition());
                }
            });

        }
    }

    public ItemListAdapter(ArrayList<Item> list1, OnItemListListener onItemListListener){
        list = list1;
        this.onItemListListener = onItemListListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {

       return new MyViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_adapter, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ((MyViewHolder)viewHolder).fillData(list.get(i), onItemListListener);

    }

    @Override
    public int getItemCount() {
        if(list!=null) {
            return list.size();
        }
        return 0;
    }
}
