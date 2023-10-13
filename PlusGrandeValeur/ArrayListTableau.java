package PlusGrandeValeur;

import java.util.ArrayList;
import java.util.Random;

/**
 * @see ArrayListTableau
 * 
 *la classe ArrayListTableau fournit des méthodes pour manipuler un tableau dynamique (ArrayList).
 */
public class ArrayListTableau {

    /**
     * @see remplirTableau 
     * vous avons une methode statique remplirTableau() qui prend en paramettre le tableau des entiers
     * puis nous creons un objet rand qui est une instance de la classe random(nous permetra de generer les vleur aleatoire ) 
     * nous creons un tableau de 15 celulle pluis nous les remplissont  avec des valeurs aléatoires entre 0 et 100 inclus.
     *
     * @param tableau Le tableau à remplir.
     */
    public static void remplirTableau(ArrayList<Integer> tableau) {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
             // Valeurs entre 0 et 100 inclus
            int nombreAleatoire = rand.nextInt(101);
            //ajouter les valeur dans le tableau 
            tableau.add(nombreAleatoire);
        }
    }

  /**
   * @see afficherTableau
 * Cette méthode affiche les éléments d'un tableau ArrayList.
 *
 * @param tableau Le tableau ArrayList à afficher.
 */
public static void afficherTableau(ArrayList<Integer> tableau) {
    // Affiche un message d'en-tête
    System.out.println("********AFFICHAGE DU TABLEAU (ArrayList)**********");

    // Parcours le tableau et affiche chaque élément
    for (int i = 0; i < tableau.size(); i++) {
        // Affiche l'élément actuel du tableau
        System.out.println("tableau[" + i + "] = " + tableau.get(i));
    }
}
}
