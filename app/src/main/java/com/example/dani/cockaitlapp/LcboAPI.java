package com.example.dani.cockaitlapp;

import retrofit2.Call;
import retrofit2.http.GET;


public interface LcboAPI {

    @GET("/api/json/v1/1/search.php?s=margarita")
    Call<MargaritasResponse> getDrinks();

    @GET("/api/json/v1/1/random.php")
    Call<RandomResponse> getRandomDrink();

    @GET("/api/json/v1/1/search.php?s=vodka")
    Call<VodkaResponse> getVodkaDrinks();

}
