package com.example.android.moldovatourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * Created by Ghena on 23/03/2017.
 */

public class WineTourActivity extends AppCompatActivity {

MediaController mc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Wine Tour");


        final ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Object("Purcari Winery", "Purcari Winery situated 75km from Chisinau city centre is known to the whole world for its premium wines, which have received awards and praise from international competitions like Decanter, Challenge International du Vin, Concours Mondial de Bruxelles, " +
                "International Wine and Spirit Competition as well as the legendary patronage of the royal court of Great Britain.\nAddress: Purcari, Ștefan-Vodă\n" +
                "Tel:(+373) 24 230 411", R.drawable.purcari_winery, "android.resource://" + getPackageName() + "/" +R.raw.purcari));
        objects.add(new Object("Cricova Winery", "\"Cricova\" JSC is a pearl of the Moldovan wine that represents an unique underground city well-known all over the world by its huge labyrinths, and especially by its excellent wines. \"Cricova\" is the first winery in Moldova which makes sparkling wine as it was prepared by " +
                "the monk - wine maker Pierre Perignon. The technology \"Méthode Traditionnelle\" is a complex and thin process, consisting in secondary, " +
                "in-bottle fermentation and the subconsequent maturation \"cuvée \"\nAddress: Cricova, str. Petru Ungureanu, 1\nTel: +373 22 604 027", R.drawable.cricova_cellar_winery));
        objects.add(new Object("Milestii Mici Winery", "Surrounded by a romantic aura, that natural wine depository – the biggest in the world – has appeared in the limestone galleries at the depth of 30-85 meters in the 70’s of the previous century.The wines that are stored here are the products of the harvest of different years, " +
                "between 1986 and 1991. Spirit of the past times is felt in this underground wine city growing out of the large tunnels. " +
                "Natural limestone galleries with total length of 200 km may be passed by transport. And the streets of the underground wine city, placed on a surface of 55 km, are full of oak buts that are standing there as guardians on the watch .\nAddress: Milestii Mici Village, Ialoveni District" +
                ", Republic of Moldova, MD-6819.\nTel: +373 22 382 333", R.drawable.milestii_mici_winery));
        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                VideoView videoview = (VideoView)findViewById(R.id.video);

                Object object = objects.get(position);

                MediaController mediaController= new MediaController(WineTourActivity.this);
                mediaController.setAnchorView(videoview);

                //specify the location of media file
                Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.purcari);

                //Setting MediaController and URI, then starting the videoView
                videoview.setMediaController(mediaController);
                videoview.setVideoURI(uri);
                videoview.requestFocus();
                videoview.start();

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.purcari ));

                        startActivity(intent);



            }
        });


    }


}


