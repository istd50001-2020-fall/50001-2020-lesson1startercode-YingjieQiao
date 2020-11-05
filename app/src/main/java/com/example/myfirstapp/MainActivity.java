package com.example.myfirstapp;

// Create a new android studio project with Empty Activity
// Copy the code below
// Go to your own MainActivity.java and
// paste it over the existing code BELOW the package statement ***
// ***Sep 2020

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    ArrayList<Integer> images;
    Button charaButton;
    Button firstImageButton;
    ImageView charaImage;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = new ArrayList<>();
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.nemo);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.snorlax);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.yoda);

        charaButton = findViewById(R.id.charaButton);
        firstImageButton = findViewById(R.id.firstImageButton);
        charaImage = findViewById(R.id.charaImage);

        charaButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "Image Button clicked!");
                Random random = new Random();
                int index = random.nextInt(images.size()-1);
                int id = images.get(index);
                //System.out.println(id);
                charaImage.setImageResource(id);
            }
        });

        firstImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "First Image Button clicked!");
                int id = images.get(0);
                //System.out.println(id);
                charaImage.setImageResource(id);
            }
        });

    }
}
