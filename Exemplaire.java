public class Exemplaire {
    public String etat;
    public String emplacement;

    public Exemplaire(String etat, String emplacement){
        this.etat = etat;
        this.emplacement = emplacement;
    }

    public String getEtat() {
        return etat;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void afficher(){
        System.out.println("Etat: "+this.getEtat()+" |Emplacement: "+this.getEmplacement());
    }
}
