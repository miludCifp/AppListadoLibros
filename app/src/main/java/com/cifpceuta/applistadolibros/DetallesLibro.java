package com.cifpceuta.applistadolibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesLibro extends AppCompatActivity {
    private ImageView imgPortadaLibro;
    private TextView tituloLibro, numPaginas, descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_libro);

        imgPortadaLibro = (ImageView) findViewById(R.id.imgVwLibro);
        tituloLibro = (TextView) findViewById(R.id.tvTituloLibro);
        numPaginas = (TextView) findViewById(R.id.tvNumPaginas);
        descripcion = (TextView) findViewById(R.id.tvDescripcionLibro);

        Intent extra = getIntent();
        if (extra !=null){
            imgPortadaLibro.setImageResource(extra.getIntExtra("extra_imagen", R.drawable.error_24));
            tituloLibro.setText(extra.getStringExtra("extra_titulo"));
            numPaginas.setText(extra.getStringExtra("extra_paginas"));
            descripcion.setText(extra.getStringExtra("extra_descripcion"));
        }
    }

    public void volverPagLibros(View v){
        Intent i = new Intent(this, MainActivityLibros.class);
        startActivity(i);
    }

}