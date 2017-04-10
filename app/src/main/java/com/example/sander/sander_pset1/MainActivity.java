package com.example.sander.sander_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

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

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visArms") == View.VISIBLE) {
                arms.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visEars") == View.VISIBLE) {
                ears.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visEyebrows") == View.VISIBLE) {
                eyebrows.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visEyes") == View.VISIBLE) {
                eyes.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visGlasses") == View.VISIBLE) {
                glasses.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visHat") == View.VISIBLE) {
                hat.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visMouth") == View.VISIBLE) {
                mouth.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visMustache") == View.VISIBLE) {
                mustache.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visNose") == View.VISIBLE) {
                nose.setVisibility(View.VISIBLE);
            }
        }

        if (savedInstanceState != null) {
            if (savedInstanceState.getInt("visShoes") == View.VISIBLE) {
                shoes.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save visibility of bodyparts
        if (arms.getVisibility() == View.INVISIBLE) {
            outState.putInt("visArms", View.INVISIBLE);
        }

        if (ears.getVisibility() == View.INVISIBLE) {
            outState.putInt("visEars", View.INVISIBLE);
        }

        if (eyebrows.getVisibility() == View.INVISIBLE) {
            outState.putInt("visEyebrows", View.INVISIBLE);
        }

        if (eyes.getVisibility() == View.INVISIBLE) {
            outState.putInt("visEyes", View.INVISIBLE);
        }

        if (glasses.getVisibility() == View.INVISIBLE) {
            outState.putInt("visGlasses", View.INVISIBLE);
        }

        if (hat.getVisibility() == View.INVISIBLE) {
            outState.putInt("visHat", View.INVISIBLE);
        }

        if (mouth.getVisibility() == View.INVISIBLE) {
            outState.putInt("visMouth", View.INVISIBLE);
        }

        if (mustache.getVisibility() == View.INVISIBLE) {
            outState.putInt("visMustache", View.INVISIBLE);
        }

        if (nose.getVisibility() == View.INVISIBLE) {
            outState.putInt("visNose", View.INVISIBLE);
        }

        if (shoes.getVisibility() == View.INVISIBLE) {
            outState.putInt("visShoes", View.INVISIBLE);
        }
    }

    /*
    onClick show functions
     */
    public void showArms(View view) {
        Log.d("entered", "showArms");

        // if visibility is VISIBLE
        if (arms.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            arms.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            arms.setVisibility(View.VISIBLE);
        }
    }

    public void showBody(View view) {
        // if visibility is VISIBLE
        if (body.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            body.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            body.setVisibility(View.VISIBLE);
        }
    }
    public void showEars(View view) {
        // if visibility is VISIBLE
        if (ears.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            ears.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            ears.setVisibility(View.VISIBLE);
        }
    }

    public void showEyebrows(View view) {
        // if visibility is VISIBLE
        if (eyebrows.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            eyebrows.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            eyebrows.setVisibility(View.VISIBLE);
        }
    }

    public void showEyes(View view) {
        // if visibility is VISIBLE
        if (eyes.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            eyes.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            eyes.setVisibility(View.VISIBLE);
        }
    }

    public void showGlasses(View view) {
        // if visibility is VISIBLE
        if (glasses.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            glasses.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            glasses.setVisibility(View.VISIBLE);
        }
    }

    public void showHat(View view) {
        // if visibility is VISIBLE
        if (hat.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            hat.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            hat.setVisibility(View.VISIBLE);
        }
    }

    public void showMouth(View view) {
        // if visibility is VISIBLE
        if (mouth.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            mouth.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            mouth.setVisibility(View.VISIBLE);
        }
    }

    public void showMustache(View view) {
        // if visibility is VISIBLE
        if (mustache.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            mustache.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            mustache.setVisibility(View.VISIBLE);
        }
    }
    public void showNose(View view) {
        // if visibility is VISIBLE
        if (nose.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            nose.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            nose.setVisibility(View.VISIBLE);
        }
    }
    public void showShoes(View view) {
        // if visibility is VISIBLE
        if (shoes.getVisibility() == View.VISIBLE) {
            // set visbility to INVISIBLE
            shoes.setVisibility(View.INVISIBLE);
        }
        else {
            // set visibility to VISIBLE
            shoes.setVisibility(View.VISIBLE);
        }
    }
}
