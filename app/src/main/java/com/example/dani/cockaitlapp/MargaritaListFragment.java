package com.example.dani.cockaitlapp;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class MargaritaListFragment extends CocktailListFragment {

    @Override
    LiveData<List<Drink>> getDrinks(){
        return mainViewModel.getDrinks();


    }

}
