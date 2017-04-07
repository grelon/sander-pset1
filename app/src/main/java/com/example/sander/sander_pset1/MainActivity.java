package com.example.sander.sander_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.id;
import static com.example.sander.sander_pset1.R.id.arms;

public class MainActivity extends AppCompatActivity {

    // initialize ImageViews
    ImageView arms;
    ImageView body;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.img_arms);
        body = (ImageView) findViewById(R.id.img_body);
        ears = (ImageView) findViewById(R.id.img_ears);
        eyebrows = (ImageView) findViewById(R.id.img_eyebrows);
        eyes = (ImageView) findViewById(R.id.img_eyes);
        glasses = (ImageView) findViewById(R.id.img_glasses);
        hat = (ImageView) findViewById(R.id.img_hat);
        mouth = (ImageView) findViewById(R.id.img_mouth);
        mustache = (ImageView) findViewById(R.id.img_mustache);
        nose = (ImageView) findViewById(R.id.img_nose);
        shoes = (ImageView) findViewById(R.id.img_shoes);
    }

    public void toggleShow(View view) {
        // if visibility is VISIBLE
        Log.d("Visible", "Hiephoi1");
        if (ears.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            Log.d("Visible", "Hiephoi2");
            ears.setVisibility(View.INVISIBLE);
            Log.d("Visible", "Hiephoi3");
        }

        else {
            // set visibility to VISIBLE
            ears.setVisibility(View.VISIBLE);
        }
    }
}
