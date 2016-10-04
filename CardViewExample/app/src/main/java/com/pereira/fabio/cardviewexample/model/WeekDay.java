package com.pereira.fabio.cardviewexample.model;

/**
 * Created by fabiopereira on 04/10/16.
 */

public class WeekDay {

    ////////////////////////////////////////////////////////////
    // Member variables
    ////////////////////////////////////////////////////////////

    private String name;
    private boolean openOnThisDay;
    private long openingTime;
    private long closingTime;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public WeekDay() {
        this.name = "";
        this.openOnThisDay = false;
        this.openingTime = 0L;
        this.closingTime = 0L;
    }

    public WeekDay(String name, boolean openOnThisDay, long openingTime, long closingTime) {
        this.name = name;
        this.openOnThisDay = openOnThisDay;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////////////////

    public void setName(String name) {
        this.name = name;
    }

    public void setOpenOnThisDay(boolean openOnThisDay) {
        this.openOnThisDay = openOnThisDay;
    }

    public void setOpeningTime(long openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(long closingTime) {
        this.closingTime = closingTime;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public boolean isOpenOnThisDay() {
        return openOnThisDay;
    }

    public long getOpeningTime() {
        return openingTime;
    }

    public long getClosingTime() {
        return closingTime;
    }

}
