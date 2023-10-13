
/**
  Titre      : manipulation ArrayList et LinkedList
  @auteur     : Pidjieu dibril
  @since       : 13/10/2023
  Description: menu principale
 @Version    : 0.0.1
*/

package PlusGrandeValeur;

/**
 * La classe Menu contient la méthodes AffichargeMenu() pour afficher le menu
 * principal.
 */

public class Menu {
    /**
     * Affiche le menu principal à l'écran.
     * 
     * @see AffichargeMenu
     */

    public static void AffichargeMenu() {
        System.out.println("****************************************");
        System.out.println("        Menu principale :");
        System.out.println("****************************************\n");
        System.out.printf("%-2s %-22s %s%n", "1.", "utiliser les tableau (ArrayList)", "*");
        System.out.printf("%-2s %-22s %s%n", "2.", "utiliser les listes chainee (LinkedList)", "*");
        System.out.printf("%-2s %-22s %s%n", "3.", "quitter le programme", "*");
        System.out.println("\n");
        System.out.print("         faite votre choix : ");
    }
}
