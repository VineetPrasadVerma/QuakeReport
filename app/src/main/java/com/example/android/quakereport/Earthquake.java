package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mPlace;
    private String mDate;


    /**
     * Create a new EarthQuake object.
     *
     * @param magnitude     is the magnitude of the earthquake.
     * @param place   is the place of the earthquake.
     * @param date is the date of the earthquake.
     **/
    public Earthquake(String magnitude, String place, String date) {
        mMagnitude = magnitude;
        mPlace = place;
        mDate = date;
    }

    //return the magnitude of the earthquake.
    public String getMagnitude() {
        return mMagnitude;
    }

    //returns the place of the earthquake.
    public String getPlace() {
        return mPlace;
    }

    //return the date of the earthquake.
    public String getDates() {
        return mDate;
    }
}
