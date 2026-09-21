<<<<<<< HEAD
import java.util.ArrayList;
=======


>>>>>>> fa1fedf (kekekek)
public class Bibliotheque {
    public String nom;
    public ArrayList<Livre> livres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<Livre>();
    }

    public void ajouterLivre(Livre l) {
        livres.add(l);
    }

    public void supprimerLivre(Livre l) {
        livres.remove(l);
    }
    public void affichageListe() {
        System.out.println("Liste des livres dans la bibliothèque " + nom + ":");
        for(Livre l : livres) {
            l.afficher();
        }
    }
}