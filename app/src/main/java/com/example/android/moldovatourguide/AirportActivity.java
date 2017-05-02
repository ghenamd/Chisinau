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

public class AirportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle(getString(R.string.airport));

        ArrayList<Object> objects = new ArrayList<>();
        // These arguments like "Chisinau Airport" can go here due to the new Object java class created with @param string1,@param string2 ,@param imageResourceId
        objects.add(new Object(getString(R.string.chisinau_airport), getString(R.string.airport_description), R.drawable.chisinau_airport));

        ObjectAdapter adapter = new ObjectAdapter(this,objects);

        ListView listView = (ListView)findViewById(R.id.list_item);

        listView.setAdapter(adapter);
    }
}

