import java.util.ArrayList;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Bibliotheque implements Serializable {
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
    public void sauvegarder(String nomFichier) {
     try {
         FileOutputStream fos = new FileOutputStream(nomFichier);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(this);
         oos.close();
         fos.close();
     } catch (java.io.IOException e) {
           e.printStackTrace();
   }
    }
    public static Bibliotheque charger(String Fichier) {
     try {
         FileInputStream fis = new FileInputStream(Fichier);
         ObjectInputStream ois = new ObjectInputStream(fis);
         Bibliotheque bibliotheque = (Bibliotheque) ois.readObject();

         ois.close();
         fis.close();

         return bibliotheque;
     } catch (Exception e) {
           e.printStackTrace();
           return null;
   }

}
}