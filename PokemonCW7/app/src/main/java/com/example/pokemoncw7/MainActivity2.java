package com.example.pokemoncw7;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //declare them
        ImageView image = findViewById(R.id.profile_image);
        TextView type1 = findViewById(R.id.type1);
        TextView defence = findViewById(R.id.defence);
        TextView attack = findViewById(R.id.attack);
        TextView total = findViewById(R.id.total);
        TextView name = findViewById(R.id.name);

        Bundle b = getIntent().getExtras();
        Pokemon poke = (Pokemon) b.getSerializable("pokemon");

        image.setImageResource(poke.getImage());
        type1.setText("Type: "+poke.getType());
        defence.setText("Defence: " + poke.getDefence());
        attack.setText("Attack: "+ poke.getAttack());
        total.setText("Total: "+ poke.getTotal());
        name.setText(poke.getName());

        if (poke.getName().equals("Blastoise")){
            type1.setTextColor(Color.parseColor("#0000ff"));
        } else if (poke.getName().equals("Blaziken")) {
            type1.setTextColor(Color.parseColor("#FF0000"));
        } else if (poke.getName().equals("Charizard")) {
            type1.setTextColor(Color.parseColor("#FF0000"));
        } else if (poke.getName().equals("Noivern")) {
            type1.setTextColor(Color.parseColor("#800080"));
        } else  {
            type1.setTextColor(Color.parseColor("#D2691E"));
        }


    }
}