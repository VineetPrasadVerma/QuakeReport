package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Create a new EarthQuake object.
     *
     * @param magnitude     is the magnitude of the earthquake.
     * @param location   is the location of the earthquake.
     * @param timeInMilliseconds is the date of the earthquake.
     * @param url is the url of the earthquake.
     **/
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mPlace = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
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

    //return the url of the earthquake.

    public String getUrl() {
        return mUrl;
    }
}
