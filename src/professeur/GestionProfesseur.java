package professeur; // Déclarer le package

import java.util.ArrayList;
import java.util.List;

public class GestionProfesseur {
    private List<Professeur> listeProfesseurs; // Liste des professeurs

    public GestionProfesseur() {
        listeProfesseurs = new ArrayList<>();
    }

    // Ajouter un professeur
    public void ajouterProfesseur(Professeur prof) {
        listeProfesseurs.add(prof);
        System.out.println("Professeur ajouté avec succès !");
    }

    // Supprimer un professeur
    public void supprimerProfesseur(String nom) {
        if (listeProfesseurs.removeIf(prof -> prof.getNom().equalsIgnoreCase(nom))) {
            System.out.println("Professeur supprimé avec succès !");
        } else {
            System.out.println("Professeur non trouvé !");
        }
    }

    // Modifier un professeur
    public void modifierProfesseur(String nom, String nouveauNom) {
        for (Professeur prof : listeProfesseurs) {
            if (prof.getNom().equalsIgnoreCase(nom)) {
                prof.setNom(nouveauNom);
                System.out.println("Nom du professeur mis à jour !");
                return;
            }
        }
        System.out.println("Professeur non trouvé !");
    }

    // Lister tous les professeurs
    public void listerProfesseurs() {
        if (listeProfesseurs.isEmpty()) {
            System.out.println("Aucun professeur enregistré.");
        } else {
            for (Professeur prof : listeProfesseurs) {
                System.out.println(prof);
            }
        }
    }

    // Obtenir le dernier professeur ajouté
    public void obtenirDernierProfesseur() {
        if (!listeProfesseurs.isEmpty()) {
            System.out.println("Dernier professeur ajouté : " + listeProfesseurs.get(listeProfesseurs.size() - 1));
        } else {
            System.out.println("Aucun professeur enregistré.");
        }
    }
}
