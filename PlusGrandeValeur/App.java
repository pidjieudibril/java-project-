package PlusGrandeValeur;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        System.out.println("Menu :");
        System.out.println("1. Utiliser ArrayList");
        System.out.println("2. Utiliser LinkedList");
        System.out.print("Choix : ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                utiliserArrayList();
                break;
            case 2:
                utiliserLinkedList();
                break;
            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }

    // Méthode pour utiliser ArrayList
    public static void utiliserArrayList() {
        ArrayList<Integer> tableau = new ArrayList<>();
        ArrayListTableau.remplirTableau(tableau);
        ArrayListTableau.afficherTableau(tableau);
        trouverPlusGrandeValeur(tableau);
    }

    // Méthode pour utiliser LinkedList
    public static void utiliserLinkedList() {
        LinkedList<Integer> liste = new LinkedList<>();
        LinkedListListechainee.remplirListe(liste);
        LinkedListListechainee.afficherListe(liste);
        trouverPlusGrandeValeur(liste);
    }

    // Trouve la plus grande valeur dans le tableau ou la liste et affiche son index.
    public static void trouverPlusGrandeValeur(Iterable<Integer> iterable) {
        int plusGrandeValeur = Integer.MIN_VALUE;
        int index = -1;
        int i = 0;

        for (int valeur : iterable) {
            if (valeur > plusGrandeValeur) {
                plusGrandeValeur = valeur;
                index = i;
            }
            i++;
        }

        if (index != -1) {
            System.out.println("La plus grande valeur est " + plusGrandeValeur + " à l'index " + index);
        } else {
            System.out.println("Le tableau (ou la liste) est vide.");
        }
    }
}

