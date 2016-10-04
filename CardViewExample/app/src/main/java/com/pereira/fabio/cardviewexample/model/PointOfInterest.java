package com.pereira.fabio.cardviewexample.model;

import com.pereira.fabio.cardviewexample.utils.Utils;

import java.util.ArrayList;

/**
 * Created by fabiopereira on 03/10/16.
 */

public class PointOfInterest {

    ////////////////////////////////////////////////////////////
    // Member variables
    ////////////////////////////////////////////////////////////

    private String name;
    private double lat;
    private double lng;
    private ArrayList<WeekDay> businessHours;
    private String email;
    private PhoneNumber phoneNumber;
    private String website;
    private String description;
    private Rating rating;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public PointOfInterest() {
        this.name = "Welcome to Bermuda's Triangle";
        this.lat = 27.132481;
        this.lng = 73.086548;
        this.businessHours = Utils.createDefaultWeekDaysList();
        this.email = "";
        this.phoneNumber = new PhoneNumber();
        this.website = "";
        this.description = "Maybe you won't be able to get out of here :p.";
        this.rating = new Rating();
    }

    public PointOfInterest(String name, double lat, double lng, ArrayList<WeekDay> businessHours,
                           String email, PhoneNumber phoneNumber, String website, String description, Rating rating) {
        if(name != null && name.length() > 0) {
            this.name = name;
        }
        else{
            this.name = "";
        }

        this.lat = lat;
        this.lng = lng;

        if(businessHours != null && businessHours.size() > 0){
            this.businessHours = businessHours;
        }
        else{
            this.businessHours = Utils.createDefaultWeekDaysList();
        }

        if(email != null && email.length() > 0){
            this.email = email;
        }
        else{
            this.email = "";
        }

        if(phoneNumber != null){
            this.phoneNumber = phoneNumber;
        }
        else{
            this.phoneNumber = new PhoneNumber();
        }

        if(website != null && website.length() > 0){
            this.website = website;
        }
        else{
            this.website = "";
        }

        if(description != null && description.length() > 0){
            this.description = description;
        }
        else{
            this.description = "";
        }

        if(rating != null){
            this.rating = rating;
        }
        else {
            this.rating = new Rating();
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////////////////

    public void setName(String name) {
        this.name = name;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setBusinessHours(ArrayList<WeekDay> businessHours) {
        this.businessHours = businessHours;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public ArrayList<WeekDay> getBusinessHours() {
        return businessHours;
    }

    public String getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getDescription() {
        return description;
    }

    public Rating getRating() {
        return rating;
    }

}
