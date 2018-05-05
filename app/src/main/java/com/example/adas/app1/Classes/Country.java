package com.example.adas.app1.Classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Adas on 2018-05-05.
 */

public class Country {

    @SerializedName("Abbreviation")
    private String abbreviation ;
    @SerializedName("CountryID")
    private long countryID ;
    @SerializedName("Name")
    private String name ;
    @SerializedName("PhonePrefix")
    private String phonePrefix  ;

    public Country(String abbreviation, long countryID, String name, String phonePrefix) {
        this.abbreviation = abbreviation;
        this.countryID = countryID;
        this.name = name;
        this.phonePrefix = phonePrefix;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public long getCountryID() {
        return countryID;
    }

    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }
}
