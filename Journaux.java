public class Journaux extends Livre {
    String marque;

    public Journaux(String titre,String auteur,int anneePublication, String marque ){
        super(titre,auteur,anneePublication);
        this.marque = marque;
    }
}
