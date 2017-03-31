package com.example.android.moldovatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ghena on 23/03/2017.
 */

public class FoodDrinkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Food and Drink");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("Roata Vremii Restaurant","A rustic moldavian restaurant with traditional food and quality wine.\nAddress: Hristo Botev, 8, Chisinau 2043\nTel: 37322664489 ",R.drawable.roata_vremii_restaurant));




        ObjectAdapter adapter = new ObjectAdapter(this,objects);
        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
