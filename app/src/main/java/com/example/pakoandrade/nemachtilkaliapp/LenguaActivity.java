package com.example.pakoandrade.nemachtilkaliapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class LenguaActivity extends AppCompatActivity {
    ImageButton imMaya;
    ImageButton imNahuatl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lengua);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imMaya = (ImageButton) findViewById(R.id.imageMaya);
        imNahuatl = (ImageButton) findViewById(R.id.imageNahuatl);

        imNahuatl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LenguaActivity.this,NahuatlActivity.class);
                startActivity(i);
            }
        });
        imMaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LenguaActivity.this,MayaActivity.class);
                startActivity(i);
            }
        });

    }

}
