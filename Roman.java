public class Roman extends Livre {
    private String genre;

    public Roman(String titre,String auteur,int anneePublication, String genre){
        super(titre,auteur,anneePublication);
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void afficher(){
        super.afficher();
        System.out.println(" |Genre :"+this.getGenre());
    }
}
