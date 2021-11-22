package com.github.inposa.dates;

import com.github.inposa.dates.utils.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date date = DateUtils.getDateNow();
        System.out.println(date.toString());

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
        System.out.println(dateFormat1.format(date));

        Date date2 = DateUtils.getDate(2016, 5, 19, 23, 59, 30);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MMMM/EEEE:HH:mm:ss",Locale.FRANCE);
        System.out.println(dateFormat2.format(date2));

        System.out.println(dateFormat2.format(DateUtils.getDateNow()));

    }
}