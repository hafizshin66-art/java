import java.util.ArrayList;
public class Bibliotheque {
    public String nom;
    public ArrayList<Livre> livres;
    public ArrayList<Emprunteur> emprenteurs;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<Livre>();
        this.emprenteurs = new ArrayList<Emprunteur>();
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

    public String rechercheTitre(String t){
        for(Livre l : livres){
            if(l.getTitre().equals(t)){
                return l.getAuteur();
            }
        }
        return null;
    }
    public void ajouterEmprenteur(Emprunteur e) {
        emprenteurs.add(e);
    }
    public void supprimerEmprunteur(Emprunteur e) {
        emprenteurs.remove(e);
    }
    public void affichageListEmprunteur() {
        System.out.println("Liste des emprunteurs dans la bibliothèque " + nom + ":");
        for(Emprunteur e : emprenteurs) {
            e.afficher();
        }
    }
}