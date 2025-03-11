import java.util.Scanner;

public class MenuProfesseur {
    public static void afficherMenuProfesseur(Scanner scanner) {
        System.out.println("\n******************************************************");
        System.out.println("          GESTION DES PROFESSEURS    ");
        System.out.println("******************************************************");
        System.out.println("1. Ajouter un professeur");
        System.out.println("2. Supprimer un professeur"); 
        System.out.println("3. Modifier les informations du professeur");
        System.out.println("4. Lister les professeurs");
        System.out.println("5. Obtenir le dernier professeur ajouté");
        System.out.println("6. Retour ");
        System.out.println("0. Accueil");
        System.out.print("Votre choix : ");
        // Récupérer le choix de l'utilisateur
        int choix = scanner.nextInt();
        // Gérer le choix de l'utilisateur
        switch (choix) {
            case 1:
                System.out.println("Ajout d'un professeur");
                break;
            case 2:
                System.out.println("Suppression d'un professeur");
                break;
            case 3:
                System.out.println("Modification des informations d'un professeur");
                break;
            case 4:
                System.out.println("Liste des professeurs");
                break;
            case 5:
                System.out.println("Dernier professeur ajouté");
                break;
            case 6:
                System.out.println("Retour au menu principal");
                break;
            case 0:
                System.out.println("Retour à l'accueil");
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
        scanner.nextLine(); // Consommer le saut de ligne pour lire la prochaine entrée utilisateur
        scanner.close();



    }
    
}
