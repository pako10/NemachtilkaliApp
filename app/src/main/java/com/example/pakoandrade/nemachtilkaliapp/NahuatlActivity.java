package com.example.pakoandrade.nemachtilkaliapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class NahuatlActivity extends AppCompatActivity {
    LinearLayout linColor;
    ImageButton imColor;
    ImageButton imAnimal;
    ImageButton imComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nahuatl);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        linColor = (LinearLayout) findViewById(R.id.linCol);
        imColor = (ImageButton) findViewById(R.id.imbColor);
        imAnimal = (ImageButton) findViewById(R.id.imbAnimales);
        imComida = (ImageButton) findViewById(R.id.imbComida);

        imComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NahuatlActivity.this,PalabraComidaActivity.class);
                startActivity(i);
            }
        });

        imAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NahuatlActivity.this,PalabraPerroActivity.class);
                startActivity(i);
            }
        });


        imColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NahuatlActivity.this, ImgColorNahuatlActivity.class);
                startActivity(i);
            }
        });
    }

}
