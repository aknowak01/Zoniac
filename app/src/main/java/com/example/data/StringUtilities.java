package com.example.data;

public class StringUtilities {
        public static String intToStringTimeFormat(long time)
        {
            String strTemp="";
            long seconds=time % 60;
            long hours=time/3600;
            long Minutes=time-hours*3600;
            long minutes=(Minutes)/60;

            if(hours>=24){
                hours=hours-24;
            }
            if(hours<10) {
                strTemp="0"+hours+":";
            }
            else {
                strTemp=hours+":";
            }
            if(minutes < 10) {
                strTemp=strTemp+"0"+minutes+":";
            }
            else {
                strTemp=strTemp+minutes+":";
            }
            if(seconds < 10) {
                strTemp=strTemp+"0"+seconds;
            }
            else {
                strTemp = strTemp + seconds;
            }
            return strTemp;
        }

}
