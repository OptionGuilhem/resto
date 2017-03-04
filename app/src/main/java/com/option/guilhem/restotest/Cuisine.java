package com.option.guilhem.restotest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Guilhem on 04/03/2017.
 */

public class Cuisine {

    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("label")
    @Expose
    public String label;
    @SerializedName("description")
    @Expose
    public Object description;
    @SerializedName("character")
    @Expose
    public Object character;
    @SerializedName("type")
    @Expose
    public String type;

}
