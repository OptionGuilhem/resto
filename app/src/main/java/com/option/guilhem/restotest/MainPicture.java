package com.option.guilhem.restotest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Guilhem on 04/03/2017.
 */

public class MainPicture {

    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("key")
    @Expose
    public String key;

}
