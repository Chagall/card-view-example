package com.pereira.fabio.cardviewexample.utils;

import com.pereira.fabio.cardviewexample.model.WeekDay;

import java.util.ArrayList;

/**
 * Created by fabiopereira on 04/10/16.
 */

public class Utils {

    public static ArrayList<WeekDay> createDefaultWeekDaysList(){
        ArrayList<WeekDay> businessHoursWeekDays = new ArrayList<>();

        businessHoursWeekDays.add(new WeekDay("Domingo", true, 1475319600000L, 1475355600000L));
        businessHoursWeekDays.add(new WeekDay("Segunda-feira", true, 1475319600000L, 1475355600000L));
        businessHoursWeekDays.add(new WeekDay("Terça-feira", true, 1475319600000L, 1475355600000L));
        businessHoursWeekDays.add(new WeekDay("Quarta-feira", true, 1475319600000L, 1475355600000L));
        businessHoursWeekDays.add(new WeekDay("Quinta-feira", true, 1475319600000L, 1475355600000L));
        businessHoursWeekDays.add(new WeekDay("Sexta-feira", true, 1475319600000L, 1475355600000L));
        businessHoursWeekDays.add(new WeekDay("Sábado", true, 1475319600000L, 1475355600000L));

        return(businessHoursWeekDays);
    }

    public static ArrayList<Long> createDefaulRatingCountList(){
        ArrayList<Long> defaultRatingCountArrayList = new ArrayList<>();

        defaultRatingCountArrayList.add(0L);
        defaultRatingCountArrayList.add(0L);
        defaultRatingCountArrayList.add(0L);
        defaultRatingCountArrayList.add(0L);
        defaultRatingCountArrayList.add(0L);

        return(defaultRatingCountArrayList);
    }

    public enum Gender {
        male, female;
    }

}
