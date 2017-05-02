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

public class HotelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        setTitle("Hotel");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("Leogrand Hotel", "Located in Chisinau city center, the Radisson Blu Leogrand Hotel is within walking distance of Sky Tower Business Center. " +
                "Many embassies and businesses are only a few minutes away. You can visit attractions such as Nativity Cathedral and Stefan Cel Mare Park, and arrange a winery tour with the help of our concierge desk." +
                " We offer transfer service to and from Chisinau International Airport, just 15 kilometers from the hotel.\nAddress: str. Mitropolit Varlaam 77, Chisinau Moldova, Republic of.\nTel: 373 (22) 201201", R.drawable.leogrand_hotel));
        objects.add(new Object("Nobil Luxury Boutique Hotel", "Nobil Luxury Boutique Hotel Moldova is a splendid five star Chisinau hotel, with 34 rooms, including Ambassador and Presidential Suites, " +
                "the best dining in Chisinau - a gorgeous panoramic restaurant unique in Moldova , with amazing city views and a rooftop terrace, an English Cigars Club, a Conference Hall, an exclusive SPA Center, " +
                "a Fitness Center, and a wonderful DESSANGE™ Beauty Salon.\nAddress: 49/1, M. Eminescu Street, MD 2012, Chisinau, Moldova\nTel: (+373 22) 400 400.", R.drawable.nobil_hotel));
        objects.add(new Object("Joly Allon Hotel", "Jolly Alon Hotel welcomes guests in the center of Chisinau meters away from theaters, the cathedral and the parliament building. The hotel opened its doors in 1970 and was remodeled in 2000." +
                "The great location of Jolly Alon Hotel provides an easy access to Stefan The Great City Park, Parcul Alunelul and National Museum of Archeology and History of Moldova within a 5-minute walk. This elegant venue is situated 450 " +
                "meters away from Birth of Christ Cathedral, Cathedral Park and The Triumphal Arch Chisinau." +
                "There are 80 guestrooms featuring Executive Three Room Suite, Spacious Suite and Deluxe Single Room equipped with a seating area, free Wi-Fi, individual climate control, a minibar and a work area. Many guestrooms offer views of Cathedral Park. " +
                "They also comprise en suite bathrooms appointed with toiletries, a hairdryer and bathrobes.\nAddress: 37, M. Cibotari Street, Chisinau, Moldova.\nTel: +373 022 881 761", R.drawable.jolly_allon_hotel));
        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
