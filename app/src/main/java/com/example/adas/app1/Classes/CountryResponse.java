package com.example.adas.app1.Classes;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Adas on 2018-05-05.
 */

public class CountryResponse {

    @SerializedName("StatusID")
    private int statusID;
    @SerializedName("StatusMessage ")
    private String statusMessage ;
    @SerializedName("Data ")
    private List<Country> country ;

    public CountryResponse(int statusID, String statusMessage, List<Country> country) {
        this.statusID = statusID;
        this.statusMessage = statusMessage;
        this.country = country;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }
}
