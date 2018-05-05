package com.example.adas.app1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.adas.app1.Classes.ApiClass;
import com.example.adas.app1.Classes.Country;
import com.example.adas.app1.Classes.CountryResponse;
import com.example.adas.app1.Fragments.ShowCountries;
import com.example.adas.app1.Fragments.ShowImages;
import com.example.adas.app1.Fragments.ShowItemList;
import com.example.adas.app1.Fragments.ShowText;
import com.example.adas.app1.Interface.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button button, button2, button3, button4;
    private static final String TAG = MainActivity.class.getSimpleName();
    private final static String API_KEY = "hK3p5QtYC4KY6uZ3RC67";


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
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(this);

        changeFragment(new ShowText());

       // setAPI();
    }

    public void changeFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.your_placeholder, fragment);
        ft.commit();
    }

    public void setAPI()
    {
        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "blad", Toast.LENGTH_LONG).show();
            return;
        }

        ApiInterface apiService = ApiClass.getClient().create(ApiInterface.class);

        Call<CountryResponse> call = apiService.getCountryList(API_KEY);
        call.enqueue(new Callback<CountryResponse>() {
            @Override
            public void onResponse(Call<CountryResponse>call, Response<CountryResponse> response) {
                List<Country> countries = response.body().getCountry();
                Log.d(TAG, "Number of countries received: " + countries.size());
            }

            @Override
            public void onFailure(Call<CountryResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
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

            case R.id.button4:
                changeFragment(new ShowCountries());
                break;
        }
    }
}
