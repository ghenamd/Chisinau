
package com.example.android.moldovatourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *
 * Created by Ghena on 24/03/2017.
 */

public class ObjectAdapter extends ArrayAdapter<Object> {



    public ObjectAdapter(Activity context, ArrayList<Object> objects) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //we use a ViewHolder in order to make scrolling smooth due to the size of the images
        // if we don't use a ViewHolder scrolling of the listView lags.
        ViewHolder holder;


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.text1 = (TextView) listItemView.findViewById(R.id.string1);
            holder.text2 = (TextView) listItemView.findViewById(R.id.string2);
            holder.image = (ImageView) listItemView.findViewById(R.id.image);
            listItemView.setTag(holder);

        } else {
            holder = (ViewHolder) listItemView.getTag();

        }

        Object currentObject = getItem(position);

        // finds the text in the ArrayList and sets it to the list_item.xml


        holder.text1.setText(currentObject.getString1());

        holder.text2.setText(currentObject.getString2());
        // finds the image in the ArrayList and sets it to the list_item.xml
        holder.image.setImageResource(currentObject.getImageResourceId());

        return listItemView;

    }

    //We create a ViewHolder object to hold all the components of the listView such as
    //text1,text2,and image.
    static class ViewHolder {
        TextView text1;
        TextView text2;
        ImageView image;
    }
}

