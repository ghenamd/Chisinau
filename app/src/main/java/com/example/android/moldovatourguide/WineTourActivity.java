package com.example.android.moldovatourguide;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
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
    private VideoView mVideoView;
    private MediaController mediaController;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Wine Tour");


        final ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Object("Purcari Winery", "Purcari Winery situated 75km from Chisinau cy centre is known to the whole world for its premium wines, which have received awards and praise from international competitions like Decanter, Challenge International du Vin, Concours Mondial de Bruxelles, International Wine and Spirit Competition as well as the legendary patronage of the royal court of Great Britain.\nAddress: Purcari, Ștefan-Vodă\n" +
                "Tel:(+373) 24 230 411","android.resource://com.cpt.sample/raw/purcari.mp4"));
        objects.add(new Object("Cricova", "\"Cricova\" JSC is a pearl of the Moldovan wine that represents an unique underground city well-known all over the world by its huge labyrinths, and especially by its excellent wines. \"Cricova\" is the first winery in Moldova which makes sparkling wine as it was prepared by the monk - wine maker Pierre Perignon. The technology \"Méthode Traditionnelle\" is a complex and thin process, consisting in secondary, in-bottle fermentation and the subconsequent maturation \"cuvée \"\nAddress: Cricova, str. Petru Ungureanu, 1\nTel: +373 22 604 027", R.drawable.cricova_cellar_winery));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                  //ArrayList Object is declared final;
                Object object= objects.get(position);

                VideoView videoView =(VideoView)findViewById(R.id.video);

                //Creating MediaController
                MediaController mediaController= new MediaController(WineTourActivity.this);
                mediaController.setAnchorView(videoView);

                //specify the location of media file
                Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+ object.getVideoPathId());

                //Setting MediaController and URI, then starting the videoView
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();



            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}


