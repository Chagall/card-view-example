package com.pereira.fabio.cardviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class CardViewActivity extends AppCompatActivity {

    // This is a reference to the Layout that will host the Card View in our Activity
    LinearLayout containerLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        // Here we get find the reference of the parent layout
        containerLinearLayout = (LinearLayout) findViewById(R.id.container_linear_layout);
        // And then inflate our card view inside it
        getLayoutInflater().inflate(R.layout.card_view, containerLinearLayout);
    }

}

