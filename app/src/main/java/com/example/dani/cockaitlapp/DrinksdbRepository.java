package com.example.dani.cockaitlapp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DrinksdbRepository {

    LcboAPI lcboAPI;

    public DrinksdbRepository(){
        lcboAPI = MoviedbModule.getAPI();
    }


    public LiveData<List<Drink>> getDrinks(){
        final MutableLiveData<List<Drink>> lista = new MutableLiveData<>();

        lcboAPI.getDrinks().enqueue(new Callback<MargaritasResponse>() {
            @Override
            public void onResponse(Call<MargaritasResponse> call, Response<MargaritasResponse> response) {
                lista.setValue(response.body().drinks);
            }

            @Override
            public void onFailure(Call<MargaritasResponse> call, Throwable t) {
                System.out.println("No se ha podido conectar con la base de datos");
            }
        });

        return lista;
    }
}
