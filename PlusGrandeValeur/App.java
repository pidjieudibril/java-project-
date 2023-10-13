
/**
 * Titre      : plus ghrande valeur 
 *@auteur     : Pidjieu dibril
  @since       : 13/10/2023
  Description: utilisation des tableau et des liste chainee
  @Version    : 0.0.1
 */

package PlusGrandeValeur;
import java.util.Scanner;
/**
 * la classe App contient la methode principale main()
 */
public class App {
    public static void main(String[] args) {
        // Creation  d'un objet Scanner pour lire l'entrée de l'utilisateur.
        Scanner scannerObj = new Scanner(System.in);
        //declaration de la variable continuer en boolean
        boolean continuer = true;
        
        // Exécute la boucle du menu tant que continuer est vrai.
        while (continuer) {
            // Affiche le menu principal.
            Menu.AffichargeMenu();
            // Lit le choix de l'utilisateur.
            int choix = scannerObj.nextInt();

            // Utilise une structure switch pour exécuter différentes actions en fonction du choix.
            switch (choix) {
                case 1:
                    // Appelle la méthode UseArrayList de la classe Traitement.
                    Traitement.UseArrayList();
                    break;
                case 2:
                    // Appelle la méthode UseLinkedList de la classe Traitement.
                    Traitement.UseLinkedList();
                    break;
                case 3:
                    // Sort de la boucle et termine le programme.
                    continuer = false;
                    break;
                default:
                    // Affiche un message d'erreur si le choix est invalide 
                    System.out.println("Choix invalide. Veuillez entrer un numéro valide.");
            }
        }

        // Ferme l'objet Scanner.
        scannerObj.close();
    }
}

 

 

