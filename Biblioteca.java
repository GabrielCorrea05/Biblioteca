package RA3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gestiona els llibres de la biblioteca.
 * 
 * @author Pol
 * @version 1.0
 */
public class Biblioteca {

    private List<Llibre> llibres;

    /**
     * Constructor de la biblioteca.
     */
    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    /**
     * Afegeix un llibre.
     * 
     * @param llibre llibre a afegir
     */
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    /**
     * Elimina un llibre pel seu títol.
     * 
     * @param titol títol del llibre
     */
    public void eliminarLlibre(String titol) {
        Llibre l = buscarLlibre(titol);

        if (l != null) {
            llibres.remove(l);
        }
    }

    /**
     * Busca un llibre pel títol.
     * 
     * @param titol títol del llibre
     * @return llibre trobat o null
     */
    public Llibre buscarLlibre(String titol) {

        for (Llibre l : llibres) {
            if (l.getTitol().equalsIgnoreCase(titol)) {
                return l;
            }
        }

        return null;
    }

    /**
     * Mostra tots els llibres.
     */
    public void llistarLlibres() {

        if (llibres.isEmpty()) {
            System.out.println("No hi ha llibres.");
        } else {
            for (Llibre l : llibres) {
                System.out.println("  " + l);
            }
        }
    }

    /**
     * Busca llibres per autor.
     * 
     * @param autor autor del llibre
     */
    public void buscarPerAutor(String autor) {

        boolean trobat = false;

        for (Llibre l : llibres) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(l);
                trobat = true;
            }
        }

        if (!trobat) {
            System.out.println("No s'han trobat llibres.");
        }
    }

    /**
     * Mostra llibres disponibles.
     */
    public void mostrarDisponibles() {

        for (Llibre l : llibres) {
            if (!l.esPrestat()) {
                System.out.println(l);
            }
        }
    }

    /**
     * Mostra llibres prestats.
     */
    public void mostrarPrestats() {

        for (Llibre l : llibres) {
            if (l.esPrestat()) {
                System.out.println(l);
            }
        }
    }

    /**
     * Retorna el nombre total de llibres.
     * 
     * @return nombre de llibres
     */
    public int comptarLlibres() {
        return llibres.size();
    }

    /**
     * Retorna la llista de llibres.
     * 
     * @return llista de llibres
     */
    public List<Llibre> getLlibres() {
        return llibres;
    }
}