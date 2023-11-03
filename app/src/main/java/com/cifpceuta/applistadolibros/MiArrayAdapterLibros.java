package com.cifpceuta.applistadolibros;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MiArrayAdapterLibros extends ArrayAdapter<Libro> {
    private Activity context;
    ArrayList<Libro> libros;
    public MiArrayAdapterLibros(Activity c,ArrayList<Libro> l){
        super(c,R.layout.layout_libro_item,l);
        this.context = c;
        this.libros = l;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View filaView = inflater.inflate(R.layout.layout_libro_item,parent,false);
        Libro libro = libros.get(position);

        TextView tvTitulo, tvPaginas;
        ImageView imgViewPortada;

        tvTitulo = (TextView) filaView.findViewById(R.id.tvTitulo);
        tvPaginas = (TextView) filaView.findViewById(R.id.tvPaginas);
        imgViewPortada = (ImageView) filaView.findViewById(R.id.imgViewPortada);


        tvTitulo.setText(libro.getTitulo());
        tvPaginas.setText("num paginas : "+String.valueOf(libro.getPaginas()));
        imgViewPortada.setImageResource(libro.getPortada());

        return filaView;
    }
}
