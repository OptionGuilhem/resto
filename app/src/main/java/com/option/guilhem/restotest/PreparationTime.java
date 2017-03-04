package com.option.guilhem.restotest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Guilhem on 04/03/2017.
 */

public class PreparationTime {

    @SerializedName("min_preparation_time")
    @Expose
    public Long minPreparationTime;
    @SerializedName("max_preparation_time")
    @Expose
    public Long maxPreparationTime;

}
