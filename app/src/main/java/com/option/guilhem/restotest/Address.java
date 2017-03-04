package com.option.guilhem.restotest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Guilhem on 04/03/2017.
 */

public class Address {

    @SerializedName("coordinates")
    @Expose
    public Coordinates coordinates;
    @SerializedName("street")
    @Expose
    public String street;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("zip")
    @Expose
    public String zip;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("formated")
    @Expose
    public String formated;

}
