package com.listentome.models;

public class MisFavoritos {

    public void adicione(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Está en tendencia ahora");
        }
    }
}
