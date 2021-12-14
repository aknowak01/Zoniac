package com.example.data;

import android.icu.util.Calendar;

public class DateCreator extends StringUtilities{
    public String cityTime(String cityName){
        int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int sec = Calendar.getInstance().get(Calendar.SECOND);
        String timeToReturn = new String();
        if(cityName=="local"){
            int timeMs= hours*3600+min*60+sec;
            return timeToReturn = intToStringTimeFormat(timeMs);
        }
        else if(cityName=="London"){
            int timeMs= hours*3600+min*60+sec;
            int londonTimeMs=timeMs-3600;

            return timeToReturn = intToStringTimeFormat(londonTimeMs);
        }
        else if(cityName=="New York"){
            int timeMs= hours*3600+min*60+sec;
            int newyorkTimeMs=timeMs-3600*6;
            return timeToReturn = intToStringTimeFormat(newyorkTimeMs);
        }
        else if(cityName=="Tokyo") {
            int timeMs= hours*3600+min*60+sec;
            int tokyoTimeMs=timeMs+3600*8;
            return timeToReturn = intToStringTimeFormat(tokyoTimeMs);
        }
        else return "something";
    }
}
