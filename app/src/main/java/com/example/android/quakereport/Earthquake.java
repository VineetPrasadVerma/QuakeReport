package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;


    /**
     * Create a new EarthQuake object.
     *
     * @param magnitude     is the magnitude of the earthquake.
     * @param location   is the location of the earthquake.
     * @param timeInMilliseconds is the date of the earthquake.
     **/
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mPlace = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    //return the magnitude of the earthquake.
    public double getMagnitude() {
        return mMagnitude;
    }

    //returns the place of the earthquake.
    public String getLocation() {
        return mPlace;
    }

    //return the date of the earthquake.
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
