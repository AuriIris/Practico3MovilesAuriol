package com.example.practico3auriol;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<Pelicula> peliculaList;

    public MovieAdapter(Context context, List<Pelicula> peliculaList) {
        this.context = context;
        this.peliculaList = peliculaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pelicula, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pelicula pelicula = peliculaList.get(position);
        holder.titulo.setText(pelicula.getTitulo());
        holder.descripcion.setText(pelicula.getDescripcion());
        Glide.with(context).load(pelicula.getImagen()).into(holder.imagen);

        holder.btdetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, activity_pelicula_detalle.class);
                intent.putExtra("titulo", pelicula.getTitulo());
                intent.putExtra("descripcion", pelicula.getDescripcion());
                intent.putExtra("actores", pelicula.getActores());
                intent.putExtra("director", pelicula.getDirector());
                intent.putExtra("imagen", pelicula.getImagen());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return peliculaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo;
        private TextView descripcion;
        private ImageView imagen;
        private Button btdetalle;
        private CardView cvPelicula;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tvTitulo1);
            descripcion = itemView.findViewById(R.id.tvDescripcion1);
            imagen = itemView.findViewById(R.id.ivPelicula1);
            btdetalle = itemView.findViewById(R.id.btDetalle);
            cvPelicula = itemView.findViewById(R.id.rvPelicula);
        }
    }
}