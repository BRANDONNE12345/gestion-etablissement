package eleve; // Assure-toi que ce package correspond à celui de ton projet

import java.util.ArrayList;
import java.util.List;

public class GestionEleve {
    private List<Eleve> listeEleves;

    public GestionEleve() {
        listeEleves = new ArrayList<>();
    }

    public void ajouterEleve(Eleve eleve) {
        listeEleves.add(eleve);
        System.out.println("Élève ajouté avec succès !");
    }

    public void supprimerEleve(String nom) {
        listeEleves.removeIf(eleve -> eleve.getNom().equalsIgnoreCase(nom));
        System.out.println("Élève supprimé avec succès !");
    }

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

    public void listerEleves() {
        if (listeEleves.isEmpty()) {
            System.out.println("Aucun élève enregistré.");
        } else {
            for (Eleve eleve : listeEleves) {
                System.out.println(eleve);
            }
        }
    }
}
