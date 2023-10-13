package PlusGrandeValeur;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListListechainee {
    // Remplit la liste avec des valeurs aléatoires entre 0 et 100 inclus.
    public static void remplirListe(LinkedList<Integer> liste) {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            int nombreAleatoire = rand.nextInt(101); // Valeurs entre 0 et 100 inclus
            liste.add(nombreAleatoire);
        }
    }

    // Affiche le contenu de la liste.
    public static void afficherListe(LinkedList<Integer> liste) {
        System.out.println("********AFFICHAGE DU TABLEAU (LinkedList)**********");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println("liste[" + i + "] = " + liste.get(i));
        }
    }
}
