package com.example.pakoandrade.nemachtilkaliapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class VozColorActivity extends AppCompatActivity {
    Button btSig;
    TextView tvPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz_color);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton reconoce = (ImageButton) findViewById(R.id.BotonVoz);
        btSig = (Button) findViewById(R.id.button2);
        tvPalabra = (TextView) findViewById(R.id.textViewP);
        btSig.setVisibility(View.GONE);

        reconoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Este es el intent del reconocimiento de voz
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                //Especificamos el idioma, en esta ocasión probé con el de Estados Unidos
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                //Iniciamos la actividad dentro de un Try en caso surja un error.

                try {
                    startActivityForResult(intent, 1);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(), "Tu dispositivo no soporta el reconocimiento de voz", Toast.LENGTH_LONG).show();
                }

            }


        });

        btSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VozColorActivity.this, FelicitacionActivity.class);
                startActivity(i);
            }
        });
    }

    public void onActivityResult(int requestcode, int resultcode, Intent datos)
    {

// Si el reconocimiento de voz es correcto almacenamos dentro de un array los datos obtenidos.
//Mostramos en pantalla el texto obtenido de la posición 0.
        if (resultcode == Activity.RESULT_OK && datos!=null)
        {

            ArrayList<String> text = datos.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if(text.get(0).equals("Netflix")||text.get(0).equals("netflix")||text.get(0).equals("next week")||text.get(0).equals("mapache")||
                    text.get(0).equals("Nextel")||text.get(0).equals("tics")||text.get(0).equals("nexiq")||text.get(0).equals("mextic")||text.get(0).equals("xtiq")||
                    text.get(0).equals("mistic")||text.get(0).equals("nextic")){
                Toast.makeText(VozColorActivity.this, "Correcto", Toast.LENGTH_SHORT).show();
                btSig.setVisibility(View.VISIBLE);
            }else {
                Toast.makeText(VozColorActivity.this, "Incorrecto,prueba de nuevo", Toast.LENGTH_SHORT).show();
                tvPalabra.setTextColor(Color.RED);
            }
        }

    }

}
