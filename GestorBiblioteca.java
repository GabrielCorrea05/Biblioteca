package RA3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gestiona els préstecs.
 * 
 * @author Pol
 * @version 1.0
 */
public class GestorBiblioteca {

    private List<Prestec> prestecs;
    private static final int MAX_PRESTECS = 3;

    /**
     * Constructor del gestor.
     */
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    /**
     * Realitza el préstec d'un llibre.
     * 
     * @param usuari usuari del préstec
     * @param llibre llibre prestat
     */
    public void prestarLlibre(Usuari usuari, Llibre llibre) {

        if (usuari.getLlibresPrestats().size() >= MAX_PRESTECS) {
            System.out.println(
                    "L'usuari ja té el màxim de llibres.");
            return;
        }

        if (llibre.esPrestat()) {
            System.out.println("Aquest llibre ja està prestat.");
            return;
        }

        llibre.prestar();

        Prestec prestec =
                new Prestec(usuari, llibre, LocalDate.now());

        prestecs.add(prestec);

        usuari.afegirLlibre(llibre);

        System.out.println(
                "Préstec fet! Retorn abans de: "
                        + prestec.getDataRetorn());
    }

    /**
     * Retorna un llibre.
     * 
     * @param usuari usuari que retorna el llibre
     * @param llibre llibre retornat
     */
    public void retornarLlibre(Usuari usuari, Llibre llibre) {

        llibre.retornar();

        usuari.retornarLlibre(llibre);

        System.out.println(
                usuari.getNom()
                        + " ha retornat: "
                        + llibre.getTitol());
    }

    /**
     * Mostra tots els préstecs actius.
     */
    public void llistarPrestecs() {

        if (prestecs.isEmpty()) {
            System.out.println("No hi ha préstecs actius.");
        } else {
            for (Prestec p : prestecs) {
                System.out.println("  " + p);
            }
        }
    }
}