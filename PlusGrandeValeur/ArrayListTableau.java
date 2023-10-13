package PlusGrandeValeur;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTableau {
    // Remplit le tableau avec des valeurs aléatoires entre 0 et 100 inclus.
    public static void remplirTableau(ArrayList<Integer> tableau) {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            int nombreAleatoire = rand.nextInt(101); // Valeurs entre 0 et 100 inclus
            tableau.add(nombreAleatoire);
        }
    }

    // Affiche le contenu du tableau.
    public static void afficherTableau(ArrayList<Integer> tableau) {
        System.out.println("********AFFICHAGE DU TABLEAU (ArrayList)**********");
        for (int i = 0; i < tableau.size(); i++) {
            System.out.println("tableau[" + i + "] = " + tableau.get(i));
        }
    }
}
