package eleve; // Déclarer le package

import java.util.Scanner;

public class MenuEleve {
    private static GestionEleve gestionEleve = new GestionEleve(); // Gestionnaire des élèves

    public static void afficherMenuEleve(Scanner scanner) {
        while (true) { // Boucle infinie pour garder le menu actif
            System.out.println("\n******************************************************");
            System.out.println("          GESTION DES ELEVES     ");
            System.out.println("******************************************************");
            System.out.println("MENU:");
            System.out.println("1. Ajouter un élève");
            System.out.println("2. Supprimer un élève");
            System.out.println("3. Modifier les informations d'un élève");
            System.out.println("4. Lister les élèves");
            System.out.println("5. Obtenir le dernier élève ajouté");
            System.out.println("6. Retour");
            System.out.println("0. Quitter");

            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Âge : ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Classe : ");
                    String classe = scanner.nextLine();
                    gestionEleve.ajouterEleve(new Eleve(nom, prenom, age, classe));
                    break;

                case 2:
                    System.out.print("Nom de l'élève à supprimer : ");
                    String nomSuppr = scanner.nextLine();
                    gestionEleve.supprimerEleve(nomSuppr);
                    break;

                case 3:
                    System.out.print("Nom de l'élève à modifier : ");
                    String nomModif = scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    String nouveauNom = scanner.nextLine();
                    gestionEleve.modifierEleve(nomModif, nouveauNom);
                    break;

                case 4:
                    gestionEleve.listerEleves();
                    break;

                case 5:
                    gestionEleve.obtenirDernierEleve();
                    break;

                case 6:
                    return; // Retourner au menu principal

                case 0:
                    System.exit(0); // Quitter l'application

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
