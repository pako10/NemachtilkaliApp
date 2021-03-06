package com.example.pakoandrade.nemachtilkaliapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class ImgPerroNahuatlActivity extends AppCompatActivity {
    ImageButton imCaballo,imPerro,imMapache,imAguila;
    Button btSig;
    RelativeLayout rvCaballo,rvPerro,rvMapache,rvAguila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_perro_nahuatl);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imAguila = (ImageButton) findViewById(R.id.imabAguila);
        rvAguila = (RelativeLayout) findViewById(R.id.relativeLayout);

        imAguila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvAguila.setBackgroundColor(Color.GREEN);
                btSig.setVisibility(View.VISIBLE);
            }
        });

        imMapache = (ImageButton) findViewById(R.id.imbMapache);
        rvMapache = (RelativeLayout) findViewById(R.id.relativeLayout2);
        imMapache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvMapache.setBackgroundColor(Color.RED);
               // getResources().getColor(R.color.colorPrimary)
            }
        });

        imCaballo = (ImageButton) findViewById(R.id.imbCaballo);
        rvCaballo = (RelativeLayout) findViewById(R.id.relativeLayout3);
        imCaballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvCaballo.setBackgroundColor(Color.RED);
            }
        });

        imPerro = (ImageButton) findViewById(R.id.imbPerro);
        rvPerro = (RelativeLayout) findViewById(R.id.relativeLayout4);
        imPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvPerro.setBackgroundColor(Color.RED);
            }
        });

        btSig = (Button) findViewById(R.id.button);
        btSig.setVisibility(View.GONE);

        btSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ImgPerroNahuatlActivity.this,VozMapacheNahuatlActivity.class);
                startActivity(i);
            }
        });


    }

}
