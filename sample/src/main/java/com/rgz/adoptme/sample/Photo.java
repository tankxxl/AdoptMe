package com.rgz.adoptme.sample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rgz on 14-12-23.
 */
public class Photo {

    @SerializedName("@size")
    public String size;

    @SerializedName("$t")
    public String url;

    @SerializedName("@id")
    public int id;
}
