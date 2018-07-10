package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Create a new Earthquake Adapter object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param earthquake  is the list of earthquake to be displayed.
     */
    public EarthquakeAdapter(Context context , ArrayList<Earthquake> earthquake){
        super(context , 0, earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Check if the existing view is being reused otherwise inflate the view.
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent ,false);
        }

        //Get the object located at the position.
        Earthquake currentEarthquakeData = getItem(position);

        //find the textview in the list item.
        TextView magnitudeTextView = convertView.findViewById(R.id.magnitude_text_view);
        //Get the current earthquake magnitude and set in the magnitude text view.
        magnitudeTextView.setText(currentEarthquakeData.getMagnitude());

        TextView placeTextView = convertView.findViewById(R.id.place_textView);
        placeTextView.setText(currentEarthquakeData.getPlace());

        TextView dateTextView = convertView.findViewById(R.id.date_text_view);
        dateTextView.setText(currentEarthquakeData.getDates());

        return convertView;
    }
}
