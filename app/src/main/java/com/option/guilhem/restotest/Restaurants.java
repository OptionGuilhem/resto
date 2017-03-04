package com.option.guilhem.restotest;

/**
 * Created by Guilhem on 04/03/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Restaurants {

    @SerializedName("restaurants")
    @Expose
    public List<Restaurant> restaurants = null;
}
