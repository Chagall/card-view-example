package com.pereira.fabio.cardviewexample.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import com.pereira.fabio.cardviewexample.R;

public class PointOfInterestDetailActivity extends AppCompatActivity {

    ImageView poiImageView;
    EditText poiName;
    EditText poiLatitude;
    EditText poiLongitude;
    EditText poiDescription;
    RatingBar poiRatingBar;
    Bundle poiDetailActivityBundle;
    FloatingActionButton poiFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_of_interest_detail);

        poiDetailActivityBundle = getIntent().getExtras();

        initView();
        initViewContents();
    }

    private void initView(){
        poiImageView = (ImageView) findViewById(R.id.poi_detail_image_view);
        poiName = (EditText) findViewById(R.id.poi_detail_location_name_edit_text);
        poiLatitude = (EditText) findViewById(R.id.poi_detail_location_latitude_edit_text);
        poiLongitude = (EditText) findViewById(R.id.poi_detail_location_longitude_edit_text);
        poiDescription = (EditText) findViewById(R.id.poi_detail_location_description);
        poiRatingBar = (RatingBar) findViewById(R.id.poi_detail_rating_bar);
        poiFab = (FloatingActionButton) findViewById(R.id.poi_detail_location_fab);

        poiName.setEnabled(false);
        poiLatitude.setEnabled(false);
        poiLongitude.setEnabled(false);
        poiDescription.setEnabled(false);

        poiFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String camposEditaveis = "Campos editaveis: " + String.valueOf(!poiName.isEnabled());
                Toast.makeText(getBaseContext(), camposEditaveis, Toast.LENGTH_SHORT).show();
                poiName.setEnabled(!poiName.isEnabled());
                poiLatitude.setEnabled(!poiLatitude.isEnabled());
                poiLongitude.setEnabled(!poiLongitude.isEnabled());
                poiDescription.setEnabled(!poiDescription.isEnabled());
            }
        });
    }

    private void initViewContents(){
        poiName.setText(poiDetailActivityBundle.getString("poi_name"));
        poiLatitude.setText(String.valueOf(poiDetailActivityBundle.getDouble("poi_lat")));
        poiLongitude.setText(String.valueOf(poiDetailActivityBundle.getDouble("poi_lng")));
        poiDescription.setText(poiDetailActivityBundle.getString("poi_detail"));
        poiRatingBar.setRating(poiDetailActivityBundle.getFloat("poi_rating"));

        switch (poiDetailActivityBundle.getInt("poi_position")){
            case 0:
                poiImageView.setImageResource(R.drawable.ferrovia_sc);
                break;
            case 1:
                poiImageView.setImageResource(R.drawable.catedral_sc);
                break;
            case 2:
                poiImageView.setImageResource(R.drawable.parque_bicao);
                break;
            case 3:
                poiImageView.setImageResource(R.drawable.rodoviaria_sc);
                break;
            case 4:
                poiImageView.setImageResource(R.drawable.memorial_maurren_maggie);
                break;
            default:
                poiImageView.setImageResource(R.drawable.parque_bicao);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(PointOfInterestDetailActivity.this, MainActivity.class));
        finish();
    }
}