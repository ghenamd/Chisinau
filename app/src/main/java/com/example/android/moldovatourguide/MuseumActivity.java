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
        setTitle("Museums");

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("The National Museum of History of Moldova","The Museum consists of temporary and permanent exhibitions that put on display archaeological objects, a vast collection of arms and armour, a numismatic collection, a photography collection, historical exhibits and military equipment and weapons.\nAddress: 31 August 1989 Str, 121 A, Chisinau MD 2012\nTel: +373 22 24-04-26",R.drawable.chisinau_history_museum));
        objects.add(new Object("National Museum of Fine Arts", "National Art Museum of Moldova is situated in the centre of Chisinau and is the only institution of such a type in Republic of Moldova. It is placed in three representative buildings which are genuine architectural monuments erected at the end of the 19th commence of the 20th centuries." +
                "At present the funds of National Art Museum of Moldova count more than 39 000 art works and reflects the evolution of arts in the 15th-21st centuries.\nAddress: 31 August 1989 Street, Chisinau, Moldova\nTel: +373 022 24 13 03", R.drawable.art_museum_chisinau));
        objects.add(new Object("The National Museum of Ethnography & Natural History","The National Museum of Ethnography and Natural History is the oldest museum in Moldova known for its rich collections of geological, paleontological, zoological, entomological, archaeological, ethnographic, and numismatic." +
                "The museum has more than 135,000 pieces, including important exhibits about the natural history of Moldova.\nAddress: 82 M.Kogilniceanu str., Chisinau\nTel: +373 22 244 002",R.drawable.chisinau_etnography_museum));

        ObjectAdapter adapter = new ObjectAdapter(this,objects);

        ListView listView = (ListView)findViewById(R.id.list_item);

        listView.setAdapter(adapter);

    }
}
