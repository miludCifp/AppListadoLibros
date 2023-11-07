package com.cifpceuta.applistadolibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesLibro extends AppCompatActivity {
    private ImageView imgPortadaLibro;
    private TextView tituloLibro, numPaginas, descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_libro);

        imgPortadaLibro = (ImageView) findViewById(R.id.imgViewPortada);
        tituloLibro = (TextView) findViewById(R.id.tvTitulo);
        numPaginas = (TextView) findViewById(R.id.tvPaginas);
        descripcion = (TextView) findViewById(R.id.tvDescripcionLibro);

        Intent extra = getIntent();
        if (extra !=null){
            imgPortadaLibro.setImageResource(extra.getIntExtra("extra_portada", com.google.android.material.R.drawable.abc_ic_star_black_16dp));

            tituloLibro.setText(extra.getStringExtra(""));
        }
    }
}