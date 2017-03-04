package com.option.guilhem.restotest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Guilhem on 04/03/2017.
 */

public class Restaurant {



    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("main_picture")
    @Expose
    public MainPicture mainPicture;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("logo")
    @Expose
    public Logo logo;
    @SerializedName("is_new")
    @Expose
    public Boolean isNew;
    @SerializedName("exclusive")
    @Expose
    public Boolean exclusive;
    @SerializedName("flash_ordering")
    @Expose
    public Boolean flashOrdering;
    @SerializedName("secondary_images")
    @Expose
    public List<Object> secondaryImages = null;
    @SerializedName("price_range")
    @Expose
    public Long priceRange;
    @SerializedName("preparation_time")
    @Expose
    public PreparationTime preparationTime;
    @SerializedName("address")
    @Expose
    public Address address;
    @SerializedName("cuisines")
    @Expose
    public List<Cuisine> cuisines = null;
    @SerializedName("favorited")
    @Expose
    public Boolean favorited;
    @SerializedName("take_away")
    @Expose
    public Boolean takeAway;
    @SerializedName("on_site")
    @Expose
    public Boolean onSite;
    @SerializedName("web_page_url")
    @Expose
    public String webPageUrl;
    @SerializedName("max_seats")
    @Expose
    public Long maxSeats;
    @SerializedName("available_at")
    @Expose
    public String availableAt;



}
