package src.homework.LibresJAVA;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class Time {
    static int millis = 1999;

    public static void main(String[] args) {
        getTime();
    }

    public static void getTime() {
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(format.format(new Date(millis)));
    }
}
