package com.listentome.main;

import com.listentome.models.Cancion;
import com.listentome.models.MisFavoritos;
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
        podcast1.setTitulo("Mentes Creativas");
        podcast1.setDuracion(60);
        podcast1.setPresentador("Javier López");
        podcast1.setDescripcion("Mentes Creativas es un podcast donde exploramos el fascinante mundo de la creatividad en todas sus formas. Cada semana, Javier López entrevista a artistas, diseñadores y pensadores innovadores que comparten sus experiencias, procesos creativos y consejos prácticos para inspirar a quienes buscan liberar su potencial creativo. Únete a nosotros para descubrir nuevas ideas, técnicas y la magia que se esconde detrás de cada obra maestra.");

        //cancion
        for (int i = 0; i < 100; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 10000; i++) {
            cancion1.reproduce();
        }

        //podcast
        for (int i = 0; i < 100; i++) {
            podcast1.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduce();
        }

        System.out.println("Total de reproducciones: " + cancion1.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + cancion1.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(podcast1);
        favoritos.adicione(cancion1);
    }
}
