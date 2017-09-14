package com.example.aderelemaryidowu.weatherapp;


import java.text.SimpleDateFormat;
import java.util.TimeZone;



import java.util.Date;

/**
 * Created by ADERELE MARY IDOWU on 7/11/2017.
 */

public class CurrentWeather {
    public String mIcon;
    public long mTime;
    public double mTemperature;
    public double mHumidity;
    public double mPrecipChange;
    public String mSummary;
    public String mTimezone;



    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
    public String getIcon() {
        return mIcon;
    }
    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId()
    {
        int iconId = R.drawable.clear_day;
        if(mIcon.equals("clear-day"))
        {
            iconId = R.drawable.clear_day;
        }
        else if(mIcon.equals("clear-night"))
        {
            iconId = R.drawable.clear_night;
        }
        else if(mIcon.equals("clear-night"))
        {
            iconId = R.drawable.clear_night;
        }
        else if(mIcon.equals("fog"))
        {
            iconId = R.drawable.fog;
        }
        else if(mIcon.equals("partly-cloudy-day"))
        {
            iconId = R.drawable.partly_cloudy;
        }
        else if(mIcon.equals("rain"))
        {
            iconId = R.drawable.rain;
        }
        else if(mIcon.equals("cloudy"))
        {
            iconId = R.drawable.cloudy;
        }
        else if(mIcon.equals("snow"))
        {
            iconId = R.drawable.snow;
        }
        else if(mIcon.equals("sunny"))
        {
            iconId = R.drawable.sunny;
        }
        else if(mIcon.equals("sleet"))
        {
            iconId = R.drawable.sleet;
        }
        else if(mIcon.equals("cloudy-night"))
        {
            iconId = R.drawable.cloudy_night;
        }
        return iconId;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }



    public String getFormattedTime()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);
        return  timeString;
    }

    public int getTemperature()
    {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChange() {
        double precipPercentage = mPrecipChange * 100;
        return (int) Math.round(precipPercentage);
    }

    public void setPrecipChange(double precipChange) {
        mPrecipChange = precipChange;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
