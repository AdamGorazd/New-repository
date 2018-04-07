package com.example.adas.app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import com.squareup.picasso.Picasso;
import android.app.Fragment;
import android.util.Log;

public class Fragment2 extends Fragment {

    Button button, button2;
    ImageView image2;
    TextView text;
    String url = "https://i.imgur.com/2fGcUfe.jpg";
    View view;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment2, container, false);
        image2 = (ImageView)RootView.findViewById(R.id.imageView2);
        loadImageFromURL(url);
        image2.setVisibility(View.INVISIBLE);
        button = (Button)RootView.findViewById(R.id.button);
        button2 = (Button)RootView.findViewById(R.id.button2);
        text = (TextView)RootView.findViewById(R.id.textView);
        text.append("obrazek");
        text.setVisibility(View.INVISIBLE);
        addListenerOnButton();
        return RootView;
    }


    public void addListenerOnButton() {
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image2.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
            }

        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                image2.setVisibility(View.INVISIBLE);
                text.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void loadImageFromURL(String url) {
        Picasso.with(getActivity()).load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(image2, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });
    }

}