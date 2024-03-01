/**
 * seance
 */
public class Seance {
    private int num;
    private String date;
    private String heure;
    private double tarif;
    private Film film;
    private int dispo;

    public Seance(int num, String date, String heure, Film film, int dispo, int tarif) {
        this.date = date;
        this.heure = heure;
        this.film = film;
        this.dispo = dispo;
        this.heure = heure;
        this.tarif = tarif;
    }

    public int reserverSeance() {
        return dispo;
    }

    public double getTarif() {
        return tarif;
    }

    public String getDate() {
        return date;
    }

    public int getDispo() {
        return dispo;
    }

    public Film getFilm() {
        return film;
    }

    public int getNum() {
        return num;
    }

    public String getHeure() {
        return heure;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}
