package com.example.dani.cockaitlapp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;


public abstract class CocktailListFragment extends Fragment {
    MainViewModel mainViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cocktail_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.movieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final DrinkListAdapter drinksRecyclerAdapter = new DrinkListAdapter();
        recyclerView.setAdapter(drinksRecyclerAdapter);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        getDrinks().observe(this, new Observer<List<Drink>>() {
            @Override
            public void onChanged(@Nullable List<Drink> drinks) {
                drinksRecyclerAdapter.setList(drinks);
                drinksRecyclerAdapter.notifyDataSetChanged();
            }
        });





        return view;
    }

    abstract LiveData<List<Drink>> getDrinks();
}