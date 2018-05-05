package com.example.adas.app1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.adas.app1.Fragments.ShowImages;
import com.example.adas.app1.Fragments.ShowItemList;
import com.example.adas.app1.Fragments.ShowText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button button, button2, button3;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(this);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(this);

        changeFragment(new ShowText());
    }

    public void changeFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.your_placeholder, fragment);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                changeFragment(new ShowText());
                break;

            case R.id.button2:
                changeFragment(new ShowImages());
                break;

            case R.id.button3:
                changeFragment(new ShowItemList());
                break;
        }
    }
}
