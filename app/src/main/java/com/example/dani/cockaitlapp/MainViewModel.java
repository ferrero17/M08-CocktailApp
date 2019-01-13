package com.example.dani.cockaitlapp;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private DrinksdbRepository drinksdbRepository;

    public MainViewModel(@NonNull Application application){
        super (application);
        drinksdbRepository = new DrinksdbRepository();

    }



    LiveData<List<Drink>> getAllMargaritas(){
        return drinksdbRepository.getDrinks();
    }


    public LiveData <List<Drink>> getRandomDrink(){

        return drinksdbRepository.getRandomDrink();
    }

    public LiveData<List<Drink>> getDrinks(){

        return drinksdbRepository.getDrinks();
    }

    public LiveData<List<Drink>> getVodkaDrinks(){

        return drinksdbRepository.getVodkaDrinks();
    }

}
