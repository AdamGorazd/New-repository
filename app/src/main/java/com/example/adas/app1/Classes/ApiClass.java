package com.example.adas.app1.Classes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Adas on 2018-05-05.
 */

public class ApiClass {

    public static final String BASE_URL = "https://testirgeneralknowledgebaseapiwcf.lbpro.pl/v3/GetCountryList/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
