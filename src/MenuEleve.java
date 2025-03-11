import java.util.Scanner;

public class MenuEleve {
    public static void afficherMenuEleve(Scanner scanner){ 
        System.out.println("\n******************************************************");
            System.out.println("          GESTION DES ELEVES     ");
            
            System.out.println("******************************************************");
            System.out.println("MENU:");
        System.out.println("1. Ajouter un élève");
        System.out.println("2. Supprimer un élève");
        System.out.println("3. Modifier les informations de l'élève");
        System.out.println("4. Lister les élèves");
        System.out.println("5. Obtenir le dernier élève ajouté");
        System.out.println("6. Retour");
        System.out.println("0. Quitter");

        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine();
         
        switch(choix){
            case 1:
                System.out.println("Ajout d'un élève");
                break;
            case 2:
                System.out.println("Suppression d'un élève");
                break;
            case 3:
                System.out.println("Modification des informations d'un élève");
                break;
            case 4:
                System.out.println("Liste des élèves");
                break;
            case 5:
                System.out.println("Dernier élève ajouté");
                break;
            case 6:
                System.out.println("Retour au menu principal");
                break;
            case 0:
                System.out.println("Quitter le programme");
                System.exit(0);
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
    }

}
}