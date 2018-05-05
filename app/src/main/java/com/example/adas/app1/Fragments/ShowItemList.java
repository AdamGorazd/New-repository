package com.example.adas.app1.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.adas.app1.Adapter.ItemListAdapter;
import com.example.adas.app1.Classes.Item;
import com.example.adas.app1.Interface.OnItemListListener;
import com.example.adas.app1.R;

import java.util.ArrayList;

/**
 * Created by Adas on 2018-04-09.
 */

public class ShowItemList extends Fragment implements OnItemListListener {

    public RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.show_item_list, container, false);

        recyclerView = view.findViewById(R.id.element);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("title1", "subtitle1", "https://i.imgur.com/2fGcUfe.jpg"));
        list.add(new Item("title2", "subtitle2", "https://i.imgur.com/2fGcUfe.jpg"));
        list.add(new Item("title3", "subtitle3", "https://i.imgur.com/2fGcUfe.jpg"));
        recyclerView.setAdapter(new ItemListAdapter(list, this));
        return view;

    }

    @Override
    public void onItemClick(Item item, int position) {
        Toast.makeText(getActivity(), item.title, Toast.LENGTH_SHORT).show();



    }
}
