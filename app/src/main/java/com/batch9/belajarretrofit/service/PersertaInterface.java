package com.batch9.belajarretrofit.service;

import com.batch9.belajarretrofit.entity.Responses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PersertaInterface {

    @GET("/perserta/")
    Call<Responses> getAllPerserta();
}
