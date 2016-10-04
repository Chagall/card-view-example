package com.pereira.fabio.cardviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView locationRecyclerView;
    PointOfInterestRecyclerViewAdapater pointOfInterestRecyclerViewAdapater;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    ArrayList<PointOfInterest> pointOfInterestArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationRecyclerView = (RecyclerView) findViewById(R.id.location_recycler_view);
        locationRecyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        locationRecyclerView.setLayoutManager(recyclerViewLayoutManager);

        initPointOfInterestArrayList();

        pointOfInterestRecyclerViewAdapater = new PointOfInterestRecyclerViewAdapater(pointOfInterestArrayList);
        locationRecyclerView.setAdapter(pointOfInterestRecyclerViewAdapater);

        initRecyclerViewOnItemClickListener();
    }

    private void initPointOfInterestArrayList() {
        pointOfInterestArrayList = new ArrayList<>();
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.ferrovia_sc), 0, 0, getString(R.string.ferrovia_description), new Rating((float) 3.2, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.catedral_sc), 0, 0, getString(R.string.catedral_description), new Rating((float) 4.5, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.parque_bicao_sc), 0, 0, getString(R.string.parque_bicao_description), new Rating((float) 1.0, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.rodoviaria_sc), 0, 0, getString(R.string.rodoviaria_description), new Rating((float) 1.5, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.memorial_maurren_maggie_sc), 0, 0, getString(R.string.memorial_description), new Rating((float) 2.0, 10, null)));
    }

    private void initRecyclerViewOnItemClickListener() {
        if (locationRecyclerView != null) {
            locationRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, locationRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Intent poiDetailIntent = new Intent(MainActivity.this, PointOfInterestDetailActivity.class);
                    Bundle poiDetailBundle = new Bundle();
                    poiDetailBundle.putInt("poi_position", position);
                    poiDetailBundle.putString("poi_name", pointOfInterestArrayList.get(position).getName());
                    poiDetailBundle.putDouble("poi_lat", pointOfInterestArrayList.get(position).getLat());
                    poiDetailBundle.putDouble("poi_lng", pointOfInterestArrayList.get(position).getLng());
                    poiDetailBundle.putString("poi_detail", pointOfInterestArrayList.get(position).getDescription());
                    poiDetailBundle.putFloat("poi_rating", pointOfInterestArrayList.get(position).getRating().getAverageRating());
                    poiDetailIntent.putExtras(poiDetailBundle);
                    startActivity(poiDetailIntent);
                    finish();
                }

                @Override
                public void onItemLongClick(View view, int position) {
                    // ...
                }
            }));
        }
    }

}

