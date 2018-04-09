package com.example.adas.app1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Fragment2 extends Fragment implements View.OnClickListener{

    public Button button, button2;
    public ImageView image2;
    public TextView text;
    public final String url = "https://i.imgur.com/2fGcUfe.jpg";

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2, container, false);
        image2 = view.findViewById(R.id.imageView2);
        loadImageFromURL(url);
        image2.setVisibility(View.INVISIBLE);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);
        button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        text = view.findViewById(R.id.textView);
        text.setText("obrazek");
        text.setVisibility(View.INVISIBLE);
        return view;
    }

    public void loadImageFromURL(String url) {
        Picasso.with(getActivity()).load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(image2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                image2.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
                break;

            case R.id.button2:
                image2.setVisibility(View.INVISIBLE);
                text.setVisibility(View.INVISIBLE);
                break;
        }
    }
}