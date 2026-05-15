package RA3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un usuari de la biblioteca.
 * 
 * @author Pol
 * @version 1.0
 */
public class Usuari {

    private String nom;
    private List<Llibre> llibresPrestats;

    /**
     * Constructor de l'usuari.
     * 
     * @param nom nom de l'usuari
     */
    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    /**
     * Retorna el nom de l'usuari.
     * 
     * @return nom de l'usuari
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifica el nom de l'usuari.
     * 
     * @param nom nou nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retorna la llista de llibres prestats.
     * 
     * @return llista de llibres
     */
    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    /**
     * Afegeix un llibre prestat.
     * 
     * @param llibre llibre prestat
     */
    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    /**
     * Retorna un llibre prestat.
     * 
     * @param llibre llibre retornat
     */
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /**
     * Mostra informació de l'usuari.
     * 
     * @return informació de l'usuari
     */
    @Override
    public String toString() {
        return "Usuari: "
                + nom
                + " | Llibres: "
                + llibresPrestats.size();
    }
}