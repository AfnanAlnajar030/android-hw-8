package com.example.pokemoncw7;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {

    ArrayList<Pokemon> mPokemon;
    Context context;

    // Constructor
    public Adapter(ArrayList<Pokemon> mPokemon, Context context ) {
        this.mPokemon = mPokemon;
        this.context = context;
    }

    // Required methods
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        // This method gives data to each item in it based on the 'position' which is the index..?
        ((ViewHolder) holder).image.setImageResource(mPokemon.get(position).getImage());
        ((ViewHolder) holder).name.setText(mPokemon.get(position).getName());
        ((ViewHolder) holder).total.setText(mPokemon.get(position).getTotal() + "");
        final int index = holder.getAdapterPosition();
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent car = new Intent(context, MainActivity2.class);
                car.putExtra("pokemon", mPokemon.get(position));
                context.startActivity(car);

            }
        });
        ((ViewHolder)holder).trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPokemon.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mPokemon.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView name;
        public TextView total;
        public View view;
        public ImageView trash;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.imageView);
            total = itemView.findViewById(R.id.total);
            trash = itemView.findViewById(R.id.trash);
        }
    }


}
