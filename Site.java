public class Site {
    private int[] numFidele;
    private Cinema cinema;

    public Site(int[] numFidele, Cinema cinema) {
        this.cinema = cinema;
        this.numFidele = numFidele;
    }

    /**
     * @param client
     * @param seance
     */

    public void reserverPlace(Client client, Seance seance) {
        // verifier si le client est fidele
        // verifier la disponibiliter du place
        // seance.reserverseance();
        double prix;
        calculerPrix(3278, client);
    }

    public void consulterFilm(Film film) {

    }

    private double calculerPrix(double prix, Client client) {
        return 272727;
    }

    public void setNumFidele(int[] numFidele) {
        this.numFidele = numFidele;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public int[] getNumFidele() {
        return numFidele;
    }

}
