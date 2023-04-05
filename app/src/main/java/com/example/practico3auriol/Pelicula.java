package com.example.practico3auriol;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private String descripcion;
    private int imagen;
    private String actores;
    private String director;

    public Pelicula(String title, int imagen, String descripcion, String actores, String director) {
        this.titulo = title;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.actores = actores;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}