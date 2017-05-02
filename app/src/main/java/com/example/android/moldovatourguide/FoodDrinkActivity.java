package com.example.android.moldovatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 *
 * Created by Ghena on 23/03/2017.
 */

public class FoodDrinkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle(getString(R.string.food_and_drink));
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("Zaxi Restaurant","\n" +
                getString(R.string.zaxi_description), R.drawable.zaxi_restaurant));
        objects.add(new Object("Poapasul Dacilor Restaurant", getString(R.string.popasul_dacilor_decription), R.drawable.popasul_dacilor_restaurant));
        objects.add(new Object("Roata Vremii Restaurant", getString(R.string.roata_vremii_description), R.drawable.roata_vremii_restaurant));

        ObjectAdapter adapter = new ObjectAdapter(this,objects);
        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
