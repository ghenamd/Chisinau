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

public class FoodDrinkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Food and Drink");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("Zaxi Restaurant","\n" +
                "Zaxi brings a sophisticated and elegant experience of fine dining to Chisinau. This upscale restaurant offers a contemporary presentation of the Asian Fusion dining style, respecting the traditions of these diverse food cultures. " +
                "With a special note comes the Asian Fusion cuisine created by our Award-winning International and Asian chefs. The panoramic views of the city and live music on Tuesdays and Fridays make the dining experience unforgettable.\nAddress: Address: str. Mitropolit Varlaam 77, Chisinau Moldova.\nTel: +373 78 201 210.", R.drawable.zaxi_restaurant));
        objects.add(new Object("Poapasul Dacilor Restaurant","A luxurious rustic restaurant with delicious traditional moldavian food. The restaurant is famous for its remarkable " +
                "atmosphere, carefully selected dishes and outstanding wines.\nAddress: str. Valea Crucii, 13, Chisinau, Moldova.\nTel: +373 691 50 543.",R.drawable.popasul_dacilor_restaurant));
        objects.add(new Object("Roata Vremii Restaurant","A rustic moldavian restaurant with traditional food and quality wine.\nAddress: Hristo Botev, 8, Chisinau 2043\nTel: 37322664489 ",R.drawable.roata_vremii_restaurant));

        ObjectAdapter adapter = new ObjectAdapter(this,objects);
        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
