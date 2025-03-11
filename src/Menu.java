import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import eleve.MenuEleve;
import professeur.MenuProfesseur;

public class Menu {
    public static void afficherMenu(Scanner scanner) {
        // Récupérer la date et l'heure système
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String heureSysteme = formatter.format(date);

        // Affichage du menu
        System.out.println("\n******************************************************");
        System.out.println("          BIENVENU DANS L’APPLICATION ETAB v1.1     ");
        System.out.println("******************************************************");
        System.out.println("MENU:");
        System.out.println("1: Gestion des élèves");
        System.out.println("2: Gestion des professeurs");
        System.out.println("3: Gestion des utilisateurs");
        System.out.println("0: Quitter");
        System.out.println("Date système : " + heureSysteme);
        System.out.println("******************************************************");

        // Demander un choix à l'utilisateur
        System.out.print("Entrez votre choix: ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne après un entier

        // Gérer le choix de l'utilisateur
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi la gestion des élèves.");
                MenuEleve.afficherMenuEleve(scanner);
                break;
            case 2:
                System.out.println("Vous avez choisi la gestion des professeurs.");
                MenuProfesseur.afficherMenuProfesseur(scanner);
                // Ici, tu peux ajouter une classe pour gérer les professeurs
                break;
            case 3:
                System.out.println("Vous avez choisi la gestion des utilisateurs.");
                MenuUtilisateur.afficherMenuUtilisateur(scanner);
                
                break;
            case 0:
                System.out.println("Fermeture de l'application. À bientôt !");
                break;
            default:
                System.out.println("Choix invalide, veuillez entrer un numéro valide.");
        }

    }
}
