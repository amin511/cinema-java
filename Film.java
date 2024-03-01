public class Film {
    private String titre;
    private int anneeFonde;
    private String nomRealisateur;
    private String[] acteurs;
    private String resume;

    // constructor
    public Film() {

    }

    public Film(String titre, int anneeFonde, String nomRealisateur, String[] acteurs, String resume) {
        titre = this.titre;
        anneeFonde = this.anneeFonde;
        nomRealisateur = this.nomRealisateur;
        resume = this.resume;
    }

    // getters
    public String[] getActeurs() {
        return acteurs;
    }

    public int getAnneeFonde() {
        return anneeFonde;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public String getResume() {
        return resume;
    }

    public String getTitre() {
        return titre;
    }

    // setters
    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setActeurs(String[] acteurs) {
        this.acteurs = acteurs;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnneeFonde(int anneeFonde) {
        this.anneeFonde = anneeFonde;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

}
