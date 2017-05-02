package com.example.android.moldovatourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 *
 * Created by Ghena on 23/03/2017.
 */

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle(getString(R.string.location));
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.google_maps_chisinau_location)));
        startActivity(intent);
    }
}

