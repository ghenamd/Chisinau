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
        setTitle("Location");
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.uk/maps/place/Chisinau,+Moldova/@46.743745,28.5562268,8.25z/data=!4m5!3m4!1s0x40c97c3628b769a1:0x37d1d6305749dd3c!8m2!3d47.0104529!4d28.8638103"));
        startActivity(intent);
    }


}

