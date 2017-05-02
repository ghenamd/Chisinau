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

public class HotelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle(getString(R.string.hotel));
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("Leogrand Hotel", getString(R.string.leogrand_hotel_description), R.drawable.leogrand_hotel));
        objects.add(new Object("Nobil Luxury Boutique Hotel", getString(R.string.nobil_hotel_description), R.drawable.nobil_hotel));
        objects.add(new Object("Joly Allon Hotel", getString(R.string.alon_hotel_description), R.drawable.jolly_allon_hotel));
        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
