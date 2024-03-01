/**
 * Cinema
 */
public class Cinema {
    private String nom;
    private Salle[] salles;

    public Cinema(String nom, Salle[] salles) {
        this.nom = nom;
        this.salles = salles;
    }

    public String getNom() {
        return nom;
    }

    public Salle[] getSalles() {
        return salles;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalles(Salle[] salles) {
        this.salles = salles;
    }

}