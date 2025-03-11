package eleve; // Assure-toi que le package est bien défini

public class Eleve {
    private String nom;
    private String prenom;
    private int age;
    private String classe;

    public Eleve(String nom, String prenom, int age, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.classe = classe;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    @Override
    public String toString() {
        return "Élève : " + nom + " " + prenom + ", Âge : " + age + ", Classe : " + classe;
    }
}
