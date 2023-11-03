package com.cifpceuta.applistadolibros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvListado;
    private MiArrayAdapterLibros adapterLibros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvListado = (ListView) findViewById(R.id.lvListado);

        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro("Acceso a datos", 424,R.drawable.acceso_datos));
        libros.add(new Libro("Lenguaje de marcas y sistemas de gestión de la información", 416,R.drawable.lenguaje_marcas));
        libros.add(new Libro("Sistemas informaticos y redes locales", 226,R.drawable.sistemas_informaticos));
        libros.add(new Libro("Entornos de desarollo", 378,R.drawable.entornos));
        libros.add(new Libro("Administracion de sistams gestores de bases de datos", 314,R.drawable.administracion_bases));

        adapterLibros = new MiArrayAdapterLibros(this, libros);
        lvListado.setAdapter(adapterLibros);

        lvListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Libro libro = (Libro) adapterLibros.getItem(position);
                Toast.makeText(view.getContext(),"Libro consultado: "+libro.getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });

    }

}