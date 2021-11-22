package com.github.inposa.dates.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static Date getDateNow(){
        return  new Date();
    }

    public static Date getDate(int year, int month, int day) {
        return DateUtils.getDate(year, month, day, 0, 0, 0);
    }

    public static Date getDate(int year, int month, int day, int hour) {
        return DateUtils.getDate(year, month, day, hour, 0, 0);
    }

    public static Date getDate(int year, int month, int day, int hour, int minute) {
        return DateUtils.getDate(year, month, day, hour, minute, 0);
    }

    public static Date getDate(int year, int month, int day, int hour, int minute, int sec) {
        Calendar calendar = Calendar.getInstance();
        month -= 1;
        calendar.set(year, month, day, hour, minute, sec);
        return calendar.getTime();
    }
}
