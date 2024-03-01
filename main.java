public class main {
    /**
     * @param args
     */
    static public void main(String[] args) {
        Film film = new Film(
                "fight-club",
                1999,
                "David-fincher",
                new String[] { "Edward Norton", "Brad pitt", "Helena Bonham" }, // actors
                " An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.");
        Seance[] seances = new Seance[2];
        seances[0] = new Seance(1, "2024-03-29", "12:00/14:00", film, 1, 1000);
        seances[0] = new Seance(1, "2024-03-29", "18:00/20:00", film, 1, 1000);

        Salle[] salles = new Salle[3];
        salles[0] = new Salle(1, 20, seances);
        salles[0] = new Salle(2, 20, seances);
        salles[0] = new Salle(3, 20, seances);

        Cinema cinema = new Cinema("ibnKhaldoune", salles);
        int[] numFidele = { 1, 2, 3, 4 };

        Site site = new Site(numFidele, cinema);

    }
}

// cinema = 3 salles chacune projetent un film durant deux seances
// salle 1 ==> 2 seances