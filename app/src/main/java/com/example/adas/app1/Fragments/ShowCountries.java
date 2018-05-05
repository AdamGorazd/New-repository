package com.example.adas.app1.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adas.app1.R;

/**
 * Created by Adas on 2018-05-05.
 */

public class ShowCountries extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.show_images, container, false);
        return view;
    }

}
