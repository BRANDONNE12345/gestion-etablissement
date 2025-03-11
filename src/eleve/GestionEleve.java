package eleve; // Indiquer que cette classe est dans le package eleve

import java.util.ArrayList;
import java.util.List;

public class GestionEleve {
    private List<Eleve> listeEleves; // Liste pour stocker les élèves

    public GestionEleve() {
        listeEleves = new ArrayList<>();
    }

    // Ajouter un élève
    public void ajouterEleve(Eleve eleve) {
        listeEleves.add(eleve);
        System.out.println("Élève ajouté avec succès !");
    }

    // Supprimer un élève
    public void supprimerEleve(String nom) {
        if (listeEleves.removeIf(eleve -> eleve.getNom().equalsIgnoreCase(nom))) {
            System.out.println("Élève supprimé avec succès !");
        } else {
            System.out.println("Élève non trouvé !");
        }
    }

    // Modifier un élève
    public void modifierEleve(String nom, String nouveauNom) {
        for (Eleve eleve : listeEleves) {
            if (eleve.getNom().equalsIgnoreCase(nom)) {
                eleve.setNom(nouveauNom);
                System.out.println("Nom de l'élève mis à jour !");
                return;
            }
        }
        System.out.println("Élève non trouvé !");
    }

    // Lister tous les élèves
    public void listerEleves() {
        if (listeEleves.isEmpty()) {
            System.out.println("Aucun élève enregistré.");
        } else {
            for (Eleve eleve : listeEleves) {
                System.out.println(eleve);
            }
        }
    }

    // Obtenir le dernier élève ajouté
    public void obtenirDernierEleve() {
        if (!listeEleves.isEmpty()) {
            System.out.println("Dernier élève ajouté : " + listeEleves.get(listeEleves.size() - 1));
        } else {
            System.out.println("Aucun élève enregistré.");
        }
    }
}
