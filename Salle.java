public class Salle {
    private int num;
    private int capacite;
    private Seance[] seances;

    public Salle(int num, int capacite, Seance[] seances) {
        this.num = num;
        this.capacite = capacite;
        this.seances = seances;
    }

    public int getCapacite() {
        return capacite;
    }

    public Seance[] getSeances() {
        return seances;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSeances(Seance[] seances) {
        this.seances = seances;
    }

}
