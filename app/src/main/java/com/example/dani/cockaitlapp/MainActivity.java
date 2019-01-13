package com.example.dani.cockaitlapp;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mViewModel;
    private RecyclerView mRecyclerView;
    private DrinkListAdapter mDrinkListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.movieList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mDrinkListAdapter = new DrinkListAdapter();
        mRecyclerView.setAdapter(mDrinkListAdapter);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mViewModel.getDrinks().observe(this, new Observer<List<Drink>>() {
            @Override
            public void onChanged(@Nullable List<Drink> drinks) {
                mDrinkListAdapter.drinkList = drinks;
                mDrinkListAdapter.notifyDataSetChanged();
            }
        });





        

    }
}
