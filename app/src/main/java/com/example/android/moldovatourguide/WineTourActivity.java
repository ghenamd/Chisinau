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

public class WineTourActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle(getString(R.string.wine_tour));
        final ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Object("Purcari Winery", getString(R.string.purcari_winery_description), R.drawable.purcari_winery));
        objects.add(new Object("Cricova Winery", getString(R.string.cricova_winery_description), R.drawable.cricova_cellar_winery));
        objects.add(new Object("Milestii Mici Winery", getString(R.string.milestii_winery_description), R.drawable.milestii_mici_winery));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}


