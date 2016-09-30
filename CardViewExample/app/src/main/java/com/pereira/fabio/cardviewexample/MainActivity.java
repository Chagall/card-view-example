package com.pereira.fabio.cardviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

}
