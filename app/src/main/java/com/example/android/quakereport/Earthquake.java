package com.example.android.quakereport;

/**
 * Created by ASUS on 10/11/2017.
 */

public class Earthquake {
    /**  Mugntud for the Parameter */
    private String mMagnitude;

    /**  Loction for the Parameter */
    private String mLocation;

    /**  Date for the Parameter */
    private String mDate;



    /** this is a method */
    public Earthquake(String date, String location, String magnitude ) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }
    public String getMagnitude() {
        return mMagnitude;
    }
    public String getLocation() {
        return mLocation;
    }
    public String getDate() {
        return mDate;
    }
}
