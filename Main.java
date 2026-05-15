package RA3;

import java.util.Scanner;

/**
 * Classe principal del programa.
 * 
 * Gestiona el menú principal de la biblioteca i
 * permet interactuar amb els llibres i préstecs.
 * 
 * @author Pol
 * @version 1.0
 */
public class Main {

    static Biblioteca biblioteca = new Biblioteca();
    static GestorBiblioteca gestor = new GestorBiblioteca();
    static Scanner tc = new Scanner(System.in);

    /**
     * Mètode principal del programa.
     * 
     * @param args arguments de consola
     */
    public static void main(String[] args) {

        // Dades inicials
        biblioteca.afegirLlibre(
                new Llibre("1984", "George Orwell"));

        biblioteca.afegirLlibre(
                new Llibre(
                        "El petit príncep",
                        "Antoine de Saint-Exupéry"));

        biblioteca.afegirLlibre(
                new Llibre(
                        "Don Quixot de la Manxa",
                        "Miguel de Cervantes"));

        biblioteca.afegirLlibre(
                new Llibre(
                        "Harry Potter i la pedra filosofal",
                        "J.K. Rowling"));

        biblioteca.afegirLlibre(
                new Llibre(
                        "Como entrenar al Gabriel",
                        "Pol Mariné"));

        int opcio;

        do {

            System.out.println("\n--- MENÚ ---");
            System.out.println("1.  Llistar llibres");
            System.out.println("2.  Afegir llibre");
            System.out.println("3.  Eliminar llibre");
            System.out.println("4.  Prestar llibre");
            System.out.println("5.  Retornar llibre");
            System.out.println("6.  Llistar préstecs");
            System.out.println("7.  Buscar llibre per autor");
            System.out.println("8.  Veure llibres disponibles");
            System.out.println("9.  Veure llibres prestats");
            System.out.println("10. Comptar llibres");
            System.out.println("11. Afegir usuari");
            System.out.println("0. Sortir");

            System.out.print("Opció: ");

            opcio = Integer.parseInt(tc.nextLine());

            switch (opcio) {

                case 1 -> biblioteca.llistarLlibres();

                case 2 -> {

                    System.out.print("Títol: ");
                    String t = tc.nextLine();

                    System.out.print("Autor: ");
                    String a = tc.nextLine();

                    biblioteca.afegirLlibre(
                            new Llibre(t, a));

                    System.out.println("Llibre afegit.");
                }

                case 3 -> {

                    System.out.print(
                            "Títol a eliminar: ");

                    String t = tc.nextLine();

                    biblioteca.eliminarLlibre(t);

                    System.out.println(
                            "Eliminat (si existia).");
                }

                case 4 -> {

                    System.out.print("Nom usuari: ");
                    String nom = tc.nextLine();

                    System.out.print("Títol llibre: ");
                    String tit = tc.nextLine();

                    Usuari u = new Usuari(nom);

                    Llibre l =
                            biblioteca.buscarLlibre(tit);

                    if (l == null) {

                        System.out.println(
                                "Llibre no trobat.");

                    } else {

                        gestor.prestarLlibre(u, l);
                    }
                }

                case 5 -> {

                    System.out.print("Nom usuari: ");
                    String nom = tc.nextLine();

                    System.out.print("Títol llibre: ");
                    String tit = tc.nextLine();

                    Usuari u = new Usuari(nom);

                    Llibre l =
                            biblioteca.buscarLlibre(tit);

                    if (l == null) {

                        System.out.println(
                                "Llibre no trobat.");

                    } else {

                        gestor.retornarLlibre(u, l);
                    }
                }

                case 6 -> gestor.llistarPrestecs();

                case 7 -> {

                    System.out.print("Autor: ");

                    String autor = tc.nextLine();

                    biblioteca.buscarPerAutor(autor);
                }

                case 8 -> biblioteca.mostrarDisponibles();

                case 9 -> biblioteca.mostrarPrestats();

                case 10 -> {

                    System.out.println(
                            "Total llibres: "
                                    + biblioteca.comptarLlibres());
                }

                case 11 -> {

                    System.out.print("Nom usuari: ");

                    String nom = tc.nextLine();

                    Usuari u = new Usuari(nom);

                    System.out.println(
                            "Usuari creat: " + u);
                }

                case 0 -> System.out.println("Fins aviat!");

                default -> System.out.println(
                        "Opció no vàlida.");
            }

        } while (opcio != 0);
    }
}