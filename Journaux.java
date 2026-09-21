public class Journaux extends Livre {
    String marque;

    public Journaux(String titre,String auteur,int anneePublication, String marque ){
        super(titre,auteur,anneePublication);
        this.marque = marque;
    }

    public String getMarque(){
        return this.marque;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public void afficher(){
        super.afficher();
        System.out.println(" |Marque :"+this.getMarque());
    }
}
