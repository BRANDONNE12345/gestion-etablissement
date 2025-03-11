import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String identifiant = "admin";
        String motDePasse = "admin";
        Scanner scanner = new Scanner(System.in);
        boolean verification = false;

        // Partie connexion
        System.out.println("***************************");
        System.out.println("      BIENVENU DANS L’APPLICATION ETAB v1.1    ");
        System.out.println("***************************");
        System.out.println("                CONNEXION                     ");

        // Boucle pour réessayer si l'utilisateur se trompe d'identifiant ou de mot de passe
        while (!verification) { 
            // Vérification de l'identifiant et du mot de passe
            System.out.print("Identifiant: ");
            String login = scanner.nextLine();

            System.out.print("Mot de passe: ");
            String password = scanner.nextLine();

            if (login.equals(identifiant) && password.equals(motDePasse)) {
                System.out.println("Connexion réussie !");
                verification = true;  
                Menu.afficherMenu(scanner);
                break;  // Sortie de la boucle si la connexion réussie
            } else {
                System.out.println("Identifiant ou mot de passe incorrect ! Veuillez réessayer.");
            }
        }

        // Fermeture du Scanner après utilisation
        scanner.close();
    }
}
