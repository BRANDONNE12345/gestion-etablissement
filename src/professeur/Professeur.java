package professeur; // Déclarer le package

public class Professeur {
    private String nom;
    private String matiere;

    public Professeur(String nom, String matiere) {
        this.nom = nom;
        this.matiere = matiere;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getMatiere() { return matiere; }
    public void setMatiere(String matiere) { this.matiere = matiere; }

    @Override
    public String toString() {
        return "Professeur : " + nom + ", Matière : " + matiere;
    }
}
