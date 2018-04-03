package com.example.adas.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button button, button2;
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        image = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        text = (TextView)findViewById(R.id.textView);

        text.append("obrazek");
        text.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.test);
                image.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
            }

        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.INVISIBLE);
                text.setVisibility(View.INVISIBLE);
            }
        });



    }

}
