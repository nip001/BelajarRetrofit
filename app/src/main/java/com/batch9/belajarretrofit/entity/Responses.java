package com.batch9.belajarretrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Responses {

    @SerializedName("statusCode")
    private int statusCode;
    @SerializedName("pesan")
    private String pesan;
    @SerializedName("data")
    private List<Perserta> data;
}
