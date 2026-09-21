
public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void afficher(){
        System.out.println("Titre: "+this.getTitre()+" |Auteur: "+this.getAuteur()+" |Année: "+this.getAnneePublication());
    }
    private boolean disponible = true;
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Le livre '" + titre + "' n'est pas disponible pour le moment.");
        }
    }
}
