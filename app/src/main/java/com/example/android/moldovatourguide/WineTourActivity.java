package com.example.android.moldovatourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ghena on 23/03/2017.
 */

public class WineTourActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Wine Tour");


        final ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Object("Purcari Winery", "Purcari Winery situated 75km from Chisinau cy centre is known to the whole world for its premium wines, which have received awards and praise from international competitions like Decanter, Challenge International du Vin, Concours Mondial de Bruxelles, International Wine and Spirit Competition as well as the legendary patronage of the royal court of Great Britain.\nAddress: Purcari, Ștefan-Vodă\n" +
                "Tel:(+373) 24 230 411", R.drawable.purcari_winery, R.raw.purcari));
        objects.add(new Object("Cricova", "\"Cricova\" JSC is a pearl of the Moldovan wine that represents an unique underground city well-known all over the world by its huge labyrinths, and especially by its excellent wines. \"Cricova\" is the first winery in Moldova which makes sparkling wine as it was prepared by the monk - wine maker Pierre Perignon. The technology \"Méthode Traditionnelle\" is a complex and thin process, consisting in secondary, in-bottle fermentation and the subconsequent maturation \"cuvée \"\nAddress: Cricova, str. Petru Ungureanu, 1\nTel: +373 22 604 027", R.drawable.cricova_cellar_winery));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Object object = objects.get(position);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(("android.resource://" + getPackageName() + "/" + object.getVideoResource())));
                intent.setDataAndType(Uri.parse(("android.resource://" + getPackageName() + "/" + object.getVideoResource())), "video/mp4");
                startActivity(intent);

            }
        });






    }


}


