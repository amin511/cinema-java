public class Client {
    private int num;
    private int numbreFilmAssiste;
    private Seance[] seancesReserves;

    public void setNum(int num) {
        this.num = num;
    }

    public void setNumbreFilmAssiste(int numbreFilmAssiste) {
        this.numbreFilmAssiste = numbreFilmAssiste;
    }

    public void setSeancesReserves(Seance[] seancesReserves) {
        this.seancesReserves = seancesReserves;
    }

    public int getNum() {
        return num;
    }

    public int getNumbreFilmAssiste() {
        return numbreFilmAssiste;
    }

    public Seance[] getSeancesReserves() {
        return seancesReserves;
    }

    public void reserver(Seance seance, Site site) {
        site.reserverPlace(this, seance);
    }

    public void consultr(Film film, Site site) {
        
    }
}
