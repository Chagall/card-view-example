package com.pereira.fabio.cardviewexample;

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
    private String description;
    private Rating rating;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public PointOfInterest() {
        this.name = "Welcome to Bermuda's Triangle";
        this.lat = 27.132481;
        this.lng = 73.086548;
        this.description = "Maybe you won't be able to get out of here :p.";
        this.rating = new Rating();
    }

    public PointOfInterest(String name, double lat, double lng, String description, Rating rating) {
        if(name != null && name.length() > 0) {
            this.name = name;
        }
        else{
            this.name = "";
        }
        this.lat = lat;
        this.lng = lng;
        if(description != null && description.length() > 0){
            this.description = description;
        }
        else{
            this.description = "";
        }
        if(rating != null){
            this.rating = rating;
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

    public String getDescription() {
        return description;
    }

    public Rating getRating() {
        return rating;
    }

}
