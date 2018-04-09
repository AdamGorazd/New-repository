package com.example.adas.app1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Adas on 2018-04-09.
 */

public class Fragment3 extends Fragment {



    public ImageView image;
    public RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3, container, false);

        recyclerView = view.findViewById(R.id.element);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<List> list = new ArrayList<>();
        list.add(new List("title1", "subtitle1", image));
        list.add(new List("title2", "subtitle2", image));
        list.add(new List("title3", "subtitle3", image));
        recyclerView.setAdapter(new Adapter1(list));
        return view;


    }
}
