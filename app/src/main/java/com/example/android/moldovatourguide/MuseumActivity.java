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

public class MuseumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle(getString(R.string.museums));

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object(getString(R.string.history_museum_chisinau), getString(R.string.history_museum_description), R.drawable.chisinau_history_museum));
        objects.add(new Object(getString(R.string.fine_arts_museum_chisinau), getString(R.string.art_museum_description), R.drawable.art_museum_chisinau));
        objects.add(new Object(getString(R.string.ethnography_museum_chisinau), getString(R.string.ethnography_museum_description), R.drawable.chisinau_ethnography_museum));

        ObjectAdapter adapter = new ObjectAdapter(this,objects);
        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);

    }
}
