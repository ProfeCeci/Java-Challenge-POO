package com.listentome.models;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int cantidadMeGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }


}
