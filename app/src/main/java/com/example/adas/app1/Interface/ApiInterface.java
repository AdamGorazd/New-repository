package com.example.adas.app1.Interface;

import com.example.adas.app1.Classes.CountryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Adas on 2018-05-05.
 */

public interface ApiInterface {

    @GET("country")
    Call<CountryResponse> getCountryList(@Query("api_key") String apiKey);

}
