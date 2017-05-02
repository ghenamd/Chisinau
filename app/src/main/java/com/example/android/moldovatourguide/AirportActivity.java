package com.example.android.moldovatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ghena on 23/03/2017.
 */

public class AirportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Airport");

        ArrayList<Object> objects = new ArrayList<>();
        // These arguments like "Chisinau Airport" can go here due to the new Object java class created with @param string1,@param string2 ,@param imageResourceId
        objects.add(new Object("Chisinau Airport","Moldova's main international airport, located 13 km (8.1 mi) southeast of the centre of Chisinau.\nIt serves as headquarters for Air Moldova, the country's national airline. " +
                "Chisinau International Airport offers connections to major destinations, within Europe and Asia.\nAddress: Aeroportului 80/30 Str, Chisinau MD 2026\nTel: +373 22 525 111",R.drawable.chisinau_airport));

        ObjectAdapter adapter = new ObjectAdapter(this,objects);

        ListView listView = (ListView)findViewById(R.id.list_item);

        listView.setAdapter(adapter);
    }
}

