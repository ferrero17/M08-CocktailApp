package com.example.dani.cockaitlapp;

import retrofit2.Call;
import retrofit2.http.GET;


public interface LcboAPI {

    @GET("/api/json/v1/1/search.php?s=margarita")
    Call<MargaritasResponse> getDrinks();

}
