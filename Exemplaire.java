public class Exemplaire {
    public String etat;
    public String dateAchat;

    public Exemplaire(String etat, String dateAchat){
        this.etat = etat;
        this.dateAchat = dateAchat;
    }

    public String getEtat() {
        return etat;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void afficher(){
        System.out.println("Etat: "+this.getEtat()+" |Date d'achat: "+this.getDateAchat());
    }
}
