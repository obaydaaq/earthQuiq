package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 10/11/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // Get the {@link AndroidFlavor} object located at this position in the list


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        locationView.setText(currentEarthquake.getLocation());

        // Get the {@link AndroidFlavor} object located at this position in the list


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        dateView.setText(currentEarthquake.getDate());


        return listItemView;


    }
}
