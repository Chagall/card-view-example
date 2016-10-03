package com.pereira.fabio.cardviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView locationRecyclerView;
    PointOfInterestRecyclerViewAdapater pointOfInterestRecyclerViewAdapater;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    ArrayList<PointOfInterest> pointOfInterestArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationRecyclerView = (RecyclerView) findViewById(R.id.location_recycler_view);
        locationRecyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        locationRecyclerView.setLayoutManager(recyclerViewLayoutManager);

        initPointOfInterestArrayList();

        pointOfInterestRecyclerViewAdapater = new PointOfInterestRecyclerViewAdapater(pointOfInterestArrayList);
        locationRecyclerView.setAdapter(pointOfInterestRecyclerViewAdapater);

    }

    private void initPointOfInterestArrayList(){
        pointOfInterestArrayList = new ArrayList<>();
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.ferrovia_sc), 0, 0, getString(R.string.ferrovia_description),new Rating((float)3.2, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.catedral_sc), 0, 0, getString(R.string.catedral_description),new Rating((float)4.5, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.parque_bicao_sc), 0, 0, getString(R.string.parque_bicao_description),new Rating((float)1.0, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.rodoviaria_sc), 0, 0, getString(R.string.rodoviaria_description),new Rating((float)1.5, 10, null)));
        pointOfInterestArrayList.add(new PointOfInterest(getString(R.string.memorial_maurren_maggie_sc), 0, 0, getString(R.string.memorial_description),new Rating((float)2.0, 10, null)));
    }

    // specify an adapter (see also next example)
    /*
    CardView testCardView;
    CardView testCardView2;
    LinearLayout verticalLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verticalLinearLayout = (LinearLayout) findViewById(R.id.card_view_holder_linear_layout);
        getLayoutInflater().inflate(R.layout.location_card_view, verticalLinearLayout);
        getLayoutInflater().inflate(R.layout.location_card_view, verticalLinearLayout);
        testCardView2 = (CardView) verticalLinearLayout.getChildAt(1);
        ((ImageView)testCardView2.findViewById(R.id.card_view_image)).setImageResource(R.drawable.parque_bicao);
        ((TextView)testCardView2.findViewById(R.id.card_view_location_name)).setText(getString(R.string.parque_bicao_title));
        ((TextView)testCardView2.findViewById(R.id.card_view_location_description)).setText(getString(R.string.parque_bicao_description));
    }
    */

}
