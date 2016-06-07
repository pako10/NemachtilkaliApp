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
import android.widget.EditText;
import android.widget.Toast;

public class PalabraPerroActivity extends AppCompatActivity {
    EditText etLeer;
    Button btSig;
    Button btAcept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabra_perro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btSig = (Button) findViewById(R.id.btSig);
        etLeer = (EditText) findViewById(R.id.input_password);
        btAcept = (Button) findViewById(R.id.btAce);

        btAcept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String compara = etLeer.getText().toString().trim();
                comparar(compara);
            }
        });

        btSig.setVisibility(View.GONE);

        btSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PalabraPerroActivity.this,ImgPerroNahuatlActivity.class);
                startActivity(i);
            }
        });
    }

    public void comparar(String s){
        if(s.equals("perro")||s.equals("Perro")){
            btSig.setVisibility(View.VISIBLE);
            btAcept.setVisibility(View.GONE);
            etLeer.setTextColor(getResources().getColor(R.color.botonSig));
            Toast.makeText(PalabraPerroActivity.this, "Correcto", Toast.LENGTH_SHORT).show();
        }else{
            etLeer.setTextColor(Color.RED);
            Toast.makeText(PalabraPerroActivity.this, "Intenta de nuevo", Toast.LENGTH_SHORT).show();
        }
    }
}
