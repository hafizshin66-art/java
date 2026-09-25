import java.util.ArrayList;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible = true;
    public ArrayList<Exemplaire> exemplaires;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.exemplaires = new ArrayList<>();
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
    
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Le livre '" + titre + "' n'est pas disponible pour le moment.");
        }
    }

    public void ajoutExemplaire(Exemplaire e){
        this.exemplaires.add(e);
    }

    public String afficherExemplaire(){
        for(Exemplaire e : exemplaires){
            e.afficher();
        }
    }


}
