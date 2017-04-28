package com.example.android.moldovatourguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This circle menu was created by using  Hitomis Circle Menu library.
        // The tutorial on how to create this circle menu has been found on youtube.
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.ic_touch_app_white_36dp, R.mipmap.ic_touch_app_white_36dp);
        circleMenu.addSubMenu(Color.parseColor("#3DC7F4"), R.mipmap.ic_room_white_24dp)
                .addSubMenu(Color.parseColor("#3DC7F4"), R.mipmap.ic_local_airport_white_24dp)
                .addSubMenu(Color.parseColor("#3DC7F4"), R.mipmap.ic_hotel_white_24dp)
                .addSubMenu(Color.parseColor("#3DC7F4"), R.mipmap.grapes)
                .addSubMenu(Color.parseColor("#3DC7F4"), R.mipmap.ic_restaurant_white_24dp)
                .addSubMenu(Color.parseColor("#3DC7F4"),R.mipmap.ic_account_balance_white_24dp);



        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             // The Handler is used to delay opening the Intent
                                                             new Handler().postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                             Intent location = new Intent(MainActivity.this,LocationActivity.class);
                                                             startActivity(location);
                                                                 }
                                                             }, 600);
                                                             Toast.makeText(MainActivity.this, "Location", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 1:
                                                             // The Handler is used to delay opening the Intent
                                                             new Handler().postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                             Intent airport = new Intent(MainActivity.this,AirportActivity.class);
                                                             startActivity(airport);
                                                                 }
                                                             }, 600);
                                                             Toast.makeText(MainActivity.this,"Airport",Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 2:
                                                             // The Handler is used to delay opening the Intent
                                                             new Handler().postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent hotel = new Intent(MainActivity.this,HotelActivity.class);
                                                                     startActivity(hotel);
                                                                 }
                                                             }, 600);
                                                             Toast.makeText(MainActivity.this,"Hotel",Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 3:
                                                             // The Handler is used to delay opening the Intent
                                                             new Handler().postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent wineTour = new Intent(MainActivity.this,WineTourActivity.class);
                                                                     startActivity(wineTour);
                                                                 }
                                                             }, 600);
                                                             Toast.makeText(MainActivity.this,"Wine Tour",Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 4:
                                                             // The Handler is used to delay opening the Intent
                                                             new Handler().postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent foodDrink = new Intent(MainActivity.this,FoodDrinkActivity.class);
                                                                     startActivity(foodDrink);
                                                                 }
                                                             }, 600);
                                                             Toast.makeText(MainActivity.this, "Food and Drink", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 5:
                                                             // The Handler is used to delay opening the Intent
                                                             new Handler().postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     Intent museum = new Intent(MainActivity.this,MuseumActivity.class);
                                                                     startActivity(museum);
                                                                 }
                                                             }, 600);
                                                             Toast.makeText(MainActivity.this, "Museums", Toast.LENGTH_SHORT).show();
                                                             break;
                                                     }
                                                 }
                                             }

        );


    }
    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }
}
