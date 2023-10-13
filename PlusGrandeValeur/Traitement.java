package PlusGrandeValeur;


import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @see Traitement
 * classe Traitement contient les methode UseArrayList() pour utiliser les tableau, UseLinkedList() pour utiliser les liste chainee
 * et en fin la methode trouverPlusGrandeValeur() qui rechercher et acchiche la plus grande valeur ainsi que son index 
 */
public class Traitement {

    /**
     * @see UseArrayList
     * Méthode pour utiliser ArrayList.
     * ici nous creons un  tableau (ArrayList) d'entiers.
     *  puis nous remplisons le tableau avec des valeur aleatoire.
     * et en fin nous trouvons  la plus grande valeur dans le tableau et affiche son index.
     */
    public static void UseArrayList() {
        ArrayList<Integer> tableau = new ArrayList<>();
        ArrayListTableau.remplirTableau(tableau);
        ArrayListTableau.afficherTableau(tableau);
        trouverPlusGrandeValeur(tableau);
    }

    /**
     * Méthode pour utiliser LinkedList.
     * Crée une liste chaînée (LinkedList) d'entiers.
     * Affiche le contenu de la liste.
     * Trouve la plus grande valeur dans la liste et affiche son index.
     */
    public static void UseLinkedList() {
        LinkedList<Integer> liste = new LinkedList<>();
        LinkedListListechainee.remplirListe(liste);
        LinkedListListechainee.afficherListe(liste);
        trouverPlusGrandeValeur(liste);
    }

    /**
     * Trouve la plus grande valeur dans le tableau ou la liste et affiche son index.
     *
     * @param iterable Le tableau ou la liste d'entiers.
     */
    public static void trouverPlusGrandeValeur(Iterable<Integer> iterable) {
        // on initialise  la valeur maximale avec la valeur minimale possible d'un entier.
        int plusGrandeValeur = Integer.MIN_VALUE;
        // Initialise l'index de la plus grande valeur à -1 (non trouvé).
        int index = -1;
        // Initialise un compteur pour suivre l'index en cours.
        int i = 0;

        // Parcourt chaque élément dans le tableau ou la liste.
        for (int valeur : iterable) {
            // Si la valeur actuelle est supérieure à la plus grande valeur trouvée jusqu'à présent.
            if (valeur > plusGrandeValeur) {
                // Met à jour la plus grande valeur.
                plusGrandeValeur = valeur;
                // Met à jour l'index de la plus grande valeur.
                index = i;
            }
            // Incrémente le compteur d'index.
            i++;
        }

        // Vérifie si une valeur maximale a été trouvée (index différent de -1).
        if (index != -1) {
            // Affiche la plus grande valeur et son index.
            System.out.println("La plus grande valeur est " + plusGrandeValeur + " et se trouve à l'index " + index);
        } else {
            // Si le tableau ou la liste est vide, affiche un message approprié.
            System.out.println("Le tableau (ou la liste) est vide.");
        }
    }
}



