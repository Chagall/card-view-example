package com.pereira.fabio.cardviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fabiopereira on 03/10/16.
 */

public class PointOfInterestRecyclerViewAdapater extends RecyclerView.Adapter {

    private ArrayList<PointOfInterest> pointOfInterestArrayList;

    public PointOfInterestRecyclerViewAdapater(ArrayList<PointOfInterest> pointOfInterestArrayList) {
        this.pointOfInterestArrayList = pointOfInterestArrayList;
    }

    private static class PointOfInterestViewHolder extends RecyclerView.ViewHolder {
        ImageView pointOfInterestImageView;
        TextView pointOfInterestName;
        TextView pointOfInterestDescription;
        RatingBar pointOfInterestRatingBar;

        PointOfInterestViewHolder(View poiCardView) {
            super(poiCardView);
            pointOfInterestImageView = (ImageView) poiCardView.findViewById(R.id.card_view_image);
            pointOfInterestName = (TextView) poiCardView.findViewById(R.id.card_view_location_name);
            pointOfInterestDescription = (TextView) poiCardView.findViewById(R.id.card_view_location_description);
            pointOfInterestRatingBar = (RatingBar) poiCardView.findViewById(R.id.card_view_rating_bar);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_card_view, parent, false);
        return new PointOfInterestViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((PointOfInterestViewHolder)holder).pointOfInterestName.setText(pointOfInterestArrayList.get(position).getName());
        ((PointOfInterestViewHolder)holder).pointOfInterestDescription.setText(pointOfInterestArrayList.get(position).getDescription());
        ((PointOfInterestViewHolder)holder).pointOfInterestRatingBar.setRating(pointOfInterestArrayList.get(position).getRating().getAverageRating());

        switch (position){
            case 0:
                ((PointOfInterestViewHolder)holder).pointOfInterestImageView.setImageResource(R.drawable.ferrovia_sc);
                break;
            case 1:
                ((PointOfInterestViewHolder)holder).pointOfInterestImageView.setImageResource(R.drawable.catedral_sc);
                break;
            case 2:
                ((PointOfInterestViewHolder)holder).pointOfInterestImageView.setImageResource(R.drawable.parque_bicao);
                break;
            case 3:
                ((PointOfInterestViewHolder)holder).pointOfInterestImageView.setImageResource(R.drawable.rodoviaria_sc);
                break;
            case 4:
                ((PointOfInterestViewHolder)holder).pointOfInterestImageView.setImageResource(R.drawable.memorial_maurren_maggie);
                break;
            default:
                ((PointOfInterestViewHolder)holder).pointOfInterestImageView.setImageResource(R.drawable.parque_bicao);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return pointOfInterestArrayList.size();
    }
}
