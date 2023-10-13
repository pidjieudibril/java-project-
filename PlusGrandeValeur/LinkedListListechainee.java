package PlusGrandeValeur;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListListechainee {
    /**
     * @see remplirListe
     * 
     * nous avons une methode statique remplirListe() qui prend en paramettre la liste  des entiers
     * puis nous creons un objet rand qui est une instance de la classe random(nous permetra de generer les vleur aleatoire ) 
     * nous creons une liste  de 15 celulle pluis nous les remplissont  avec des valeurs aléatoires entre 0 et 100 inclus.
     
     *
     * @param liste La liste chaînée à remplir.
     */
    public static void remplirListe(LinkedList<Integer> liste) {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            // Valeurs entre 0 et 100 inclus
            int nombreAleatoire = rand.nextInt(101); 
            //ajouter les valeur dans la liste 
            liste.add(nombreAleatoire);
        }
    }

    /**
     * @see afficherListe
     * Affiche le contenu de la liste chaînée.
     *
     * @param liste La liste chaînée à afficher.
     */
    public static void afficherListe(LinkedList<Integer> liste) {
        // Affiche un message d'en-tête
        System.out.println("********AFFICHAGE DU TABLEAU (LinkedList)**********");

        // Parcours la liste et affiche chaque élément de cette liste 
        for (int i = 0; i < liste.size(); i++) {
            // Affiche l'élément actuel de la liste chaînée
            System.out.println("Ma liste[" + i + "] = " + liste.get(i));
        }
    }
}
