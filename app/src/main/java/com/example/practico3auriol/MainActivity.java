package com.example.practico3auriol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private com.example.practico3auriol.MovieAdapter adapter;
    private List<Pelicula> peliculaList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peliculaList = new ArrayList<>();
        peliculaList.add(new Pelicula("Matrix", R.drawable.peli1, "Un hacker descubre que la realidad en la que vive es una simulación creada por máquinas, y se une a una rebelión para combatirlas.", "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss", "Hermanas Wachowski"));
        peliculaList.add(new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", R.drawable.peli2, "Un joven hobbit recibe un anillo mágico que podría ser la clave para salvar a su mundo del malvado Sauron.", "Elijah Wood, Ian McKellen, Viggo Mortensen", "Peter Jackson"));
        peliculaList.add(new Pelicula("Titanic", R.drawable.peli3, "Una joven aristócrata y un artista pobre se enamoran a bordo del Titanic durante su viaje inaugural en 1912.", "Leonardo DiCaprio, Kate Winslet, Billy Zane", "James Cameron"));

        recyclerView = findViewById(R.id.rvPelicula);
        adapter = new com.example.practico3auriol.MovieAdapter(this, peliculaList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                ((LinearLayoutManager) layoutManager).getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}