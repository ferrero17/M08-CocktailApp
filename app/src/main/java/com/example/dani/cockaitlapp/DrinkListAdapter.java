package com.example.dani.cockaitlapp;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DrinkListAdapter extends RecyclerView.Adapter<DrinkListAdapter.DrinkListViewHolder> {

public List<Drink> drinkList = new ArrayList<>();

    @NonNull
    @Override
    public DrinkListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_drink, parent, false);
        return  new DrinkListViewHolder(view);

}

    @Override
    public void onBindViewHolder(@NonNull DrinkListViewHolder drinkHolder, int i) {
        Drink drink = drinkList.get(i);
        drinkHolder.name.setText( drink.strDrink);
       // drinkHolder.alcohol.setText("Alcohol / Sin Alcohol: " + drink.strAlcoholic);
        GlideApp.with(drinkHolder.itemView.getContext()).load(drink.strDrinkThumb).into(drinkHolder.foto);
        drinkHolder.descripcion.setText( drink.strIngredient2);
        drinkHolder.ingredientes.setText( drink.strIngredient1);
        drinkHolder.ingredientes3.setText( drink.strIngredient3);
        drinkHolder.ingredientes4.setText(drink.strIngredient4);

    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public void setList(List<Drink> drinks){

        this.drinkList = drinks;
    }


    class DrinkListViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView alcohol;
        ImageView foto;
        TextView descripcion;
        TextView ingredientes;
        TextView ingredientes3;
        TextView ingredientes4;

        public DrinkListViewHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.drinkName);
            alcohol = itemView.findViewById(R.id.drinkAlcohol);
            foto = itemView.findViewById(R.id.drinkFoto);

            descripcion = itemView.findViewById(R.id.drinkDescription);
            ingredientes = itemView.findViewById(R.id.drinkIngredients);

            ingredientes3 = itemView.findViewById(R.id.drinkIngredients3);
            ingredientes4 = itemView.findViewById(R.id.drinkIngredients4);


        }

    }



}
