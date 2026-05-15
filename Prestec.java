package RA3;

import java.time.LocalDate;

/**
 * Classe que representa un préstec d'un llibre.
 * 
 * @author Pol
 * @version 1.0
 */
public class Prestec {

    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;

    /**
     * Constructor del préstec.
     * 
     * @param usuari usuari que demana el llibre
     * @param llibre llibre prestat
     * @param dataPrestec data del préstec
     */
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    /**
     * Retorna l'usuari del préstec.
     * 
     * @return usuari
     */
    public Usuari getUsuari() {
        return usuari;
    }

    /**
     * Retorna el llibre prestat.
     * 
     * @return llibre prestat
     */
    public Llibre getLlibre() {
        return llibre;
    }

    /**
     * Retorna la data límit.
     * 
     * @return data de retorn
     */
    public LocalDate getDataRetorn() {
        return dataRetorn;
    }

    /**
     * Mostra la informació del préstec.
     * 
     * @return informació del préstec
     */
    @Override
    public String toString() {
        return usuari.getNom() + " té "
                + llibre.getTitol()
                + " fins " + dataRetorn;
    }
}