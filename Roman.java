public class Roman extends Livre {
    String genre;

    public Roman(String titre,String auteur,int anneePublication, String genre){
        super(titre,auteur,anneePublication);
        this.genre = genre;
    }


}
