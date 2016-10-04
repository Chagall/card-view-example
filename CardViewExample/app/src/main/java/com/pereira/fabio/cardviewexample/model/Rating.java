package com.pereira.fabio.cardviewexample.model;

import com.pereira.fabio.cardviewexample.utils.Utils;

import java.util.ArrayList;

/**
 * Created by fabiopereira on 03/10/16.
 *
 * The Average Rating is calculated using the following formula: (ratingCountArrayList[0] +
 * ratingCountArrayList[1] + ratingCountArrayList[2] + ratingCountArrayList[3]+
 * ratingCountArrayList[4]) / numberOfVotes
 */

public class Rating {

    ////////////////////////////////////////////////////////////
    // Member variables
    ////////////////////////////////////////////////////////////

    private float averageRating;
    private long numberOfVotes;
    private ArrayList<Long> ratingCountArrayList;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public Rating() {
        this.averageRating = 0;
        this.numberOfVotes = 0;
        this.ratingCountArrayList = Utils.createDefaulRatingCountList();
    }

    public Rating(float avgRating, long numOfVotes, ArrayList<Long> ratingCountArrayList) {
        this.averageRating = avgRating;
        this.numberOfVotes = numOfVotes;
        if(ratingCountArrayList != null && ratingCountArrayList.size() == 5) {
            this.ratingCountArrayList = ratingCountArrayList;
        }
        else {
            this.ratingCountArrayList = Utils.createDefaulRatingCountList();
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////////////////

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public void setNumberOfVotes(long numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public void setRatingCountArrayList(ArrayList<Long> ratingCountArrayList) {
        this.ratingCountArrayList = ratingCountArrayList;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////

    public float getAverageRating() {
        return averageRating;
    }

    public long getNumberOfVotes() {
        return numberOfVotes;
    }

    public ArrayList<Long> getRatingCountArrayList() {
        return ratingCountArrayList;
    }
}
