package RA3;

/**
 * Classe que representa un llibre de la biblioteca.
 * Guarda el títol, autor i estat del préstec.
 * 
 * @author Pol
 * @version 1.0
 */
public class Llibre {

    private String titol;
    private String autor;
    private boolean prestat;

    /**
     * Constructor del llibre.
     * 
     * @param titol Títol del llibre
     * @param autor Autor del llibre
     */
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    /**
     * Retorna el títol del llibre.
     * 
     * @return títol del llibre
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Retorna l'autor del llibre.
     * 
     * @return autor del llibre
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Comprova si el llibre està prestat.
     * 
     * @return true si està prestat
     */
    public boolean esPrestat() {
        return prestat;
    }

    /**
     * Modifica el títol del llibre.
     * 
     * @param titol nou títol
     */
    public void setTitol(String titol) {
        this.titol = titol;
    }

    /**
     * Modifica l'autor del llibre.
     * 
     * @param autor nou autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Marca el llibre com prestat.
     */
    public void prestar() {
        prestat = true;
    }

    /**
     * Marca el llibre com disponible.
     */
    public void retornar() {
        prestat = false;
    }

    /**
     * Mostra la informació del llibre.
     * 
     * @return text amb informació del llibre
     */
    @Override
    public String toString() {
        return titol + " de " + autor +
                (prestat ? " (En préstec)" : " (Disponible)");
    }
}