package com.example.toolboxtewari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    public static final String BREAD = "bread";
    public static final String TYPE = "type";
    public static final boolean TOASTED = false;
    public static final String LETTUCE = "lettuce";
    public static final String CUCUMBER = "cucumber";
    public static final String TOMATO = "TOMATO";
    public static final String ONION = "ONION";
    public static final String RANCH = "ranch";
    public static final String CHIPOTLE = "chipotle";
    public static final String HONEY = "honey";
    public static final String MAYO = "mayo";

    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        display = (TextView) findViewById(R.id.displayBread);

        Intent intent = getIntent();
        String bread = intent.getStringExtra(BREAD);
        String type = intent.getStringExtra(TYPE);
        boolean toasted = intent.getBooleanExtra("toasted", false);
        boolean lettuce = intent.getBooleanExtra("lettuce", false);
        boolean cucumber = intent.getBooleanExtra("cucumber", false);
        boolean tomato = intent.getBooleanExtra("tomato", false);
        boolean onion = intent.getBooleanExtra("onion", false);
        boolean ranch = intent.getBooleanExtra("ranch", false);
        boolean chipotle = intent.getBooleanExtra("chipotle", false);
        boolean honey = intent.getBooleanExtra("honey", false);
        boolean mayo = intent.getBooleanExtra("mayo", false);

        String strToDisplay = "Bread Type: " + bread + "\nSandwich Type: " + type + "\nToasted?: " + toasted + "\nVegetables: " + "Lettuce: " +
                lettuce + " Cucumber:" + cucumber + " Tomato: " + tomato + " Onion: " + onion +
                "\nCondiments: " + "Ranch: " + ranch + " Chipotle: " + chipotle + " Honey: " + honey + " Mayonnaise: " + mayo;

        display.setText(strToDisplay);

        //123



    }
}
