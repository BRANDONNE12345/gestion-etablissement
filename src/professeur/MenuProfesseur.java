package professeur; // Déclarer le package

import java.util.Scanner;

public class MenuProfesseur {
    private static GestionProfesseur gestionProfesseur = new GestionProfesseur(); // Instance de gestion

    public static void afficherMenuProfesseur(Scanner scanner) {
        while (true) { // Boucle pour que le menu reste actif
            System.out.println("\n******************************************************");
            System.out.println("          GESTION DES PROFESSEURS    ");
            System.out.println("******************************************************");
            System.out.println("1. Ajouter un professeur");
            System.out.println("2. Supprimer un professeur");
            System.out.println("3. Modifier les informations d'un professeur");
            System.out.println("4. Lister les professeurs");
            System.out.println("5. Obtenir le dernier professeur ajouté");
            System.out.println("6. Retour");
            System.out.println("0. Quitter");

            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom du professeur : ");
                    String nom = scanner.nextLine();
                    System.out.print("Matière enseignée : ");
                    String matiere = scanner.nextLine();
                    gestionProfesseur.ajouterProfesseur(new Professeur(nom, matiere));
                    break;

                case 2:
                    System.out.print("Nom du professeur à supprimer : ");
                    String nomSuppr = scanner.nextLine();
                    gestionProfesseur.supprimerProfesseur(nomSuppr);
                    break;

                case 3:
                    System.out.print("Nom du professeur à modifier : ");
                    String nomModif = scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    String nouveauNom = scanner.nextLine();
                    gestionProfesseur.modifierProfesseur(nomModif, nouveauNom);
                    break;

                case 4:
                    gestionProfesseur.listerProfesseurs();
                    break;

                case 5:
                    gestionProfesseur.obtenirDernierProfesseur();
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
