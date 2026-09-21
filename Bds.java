public class Bds extends Livre {
    private String pays;

    public Bds(String titre, String auteur, int anneePublication, String pays) {
        super(titre, auteur, anneePublication);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }
}