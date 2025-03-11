import java.util.Scanner;

public class MenuUtilisateur {
    public static void afficherMenuUtilisateur(Scanner scanner
    ) {
        System.out.println("\n***** MENU UTILISATEUR *****");
        System.out.println("1. Ajouter un utilisateur");
        System.out.println("2. Supprimer un utilisateur");
        System.out.println("3. Modifier les informations d’un utilisateur");  
        System.out.println("4. Lister les utilisateurs");
        System.out.println("5. Retour");
        System.out.print(" 0. Accueil");
        System.out.print(" Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne après un entier
    
        switch (choix) {
            case 1:
                System.out.println("Ajout d'un utilisateur");
                break;
                
            case 2:
                System.out.println("Suppression d'un utilisateur");
                break;
                
            case 3:
                System.out.println("Modification des informations d'un utilisateur");
                break;
                
            case 4:
                System.out.println("Liste des utilisateurs");
                break;
                
            case 5:
                System.out.println("Retour au menu précédent");
                break;
                
            case 0:
                System.out.println("Retour à l'accueil");
                break;
                
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                afficherMenuUtilisateur(scanner);
                break;
                    
        }

}
}
