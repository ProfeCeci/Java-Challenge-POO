package com.listentome.main;

import com.listentome.models.Cancion;
import com.listentome.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Levitating");
        cancion1.setDuracion(4);
        cancion1.setCantante("Dua Lipa");
        cancion1.setAlbum("Future Nostalgia");
        cancion1.setGenero("Pop");

//        System.out.println("Nombre de la cancion: " + cancion1.getTitulo());
//        System.out.println("Duracion: " + cancion1.getDuracion() + " minutos");

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("");
        podcast1.setDuracion(60);
        podcast1.setPresentador("");
        podcast1.setDescripcion("");

        for (int i = 0; i < 100; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            cancion1.reproduce();
        }

        System.out.println("Total de reproducciones: " + cancion1.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + cancion1.getTotalMeGusta());
    }
}
