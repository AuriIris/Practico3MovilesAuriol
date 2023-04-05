package com.example.practico3auriol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.practico3auriol.databinding.ActivityPeliculaDetalleBinding;
import android.content.Intent;
import android.os.Bundle;

public class activity_pelicula_detalle extends AppCompatActivity {

    private @NonNull ActivityPeliculaDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPeliculaDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String title = intent.getStringExtra("titulo");
        String description = intent.getStringExtra("descripcion");
        String actors = intent.getStringExtra("actores");
        String director = intent.getStringExtra("director");
        int imageResourceId = intent.getIntExtra("imagen", 0);

        binding.tvTitulo.setText(title);
        binding.tvDescripcion.setText(description);
        binding.tvActores.setText(actors);
        binding.tvDirector.setText(director);
        Glide.with(this).load(imageResourceId).into(binding.ivPelicula);
    }

}