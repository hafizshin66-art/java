import java.util.ArrayList;
import java.io.Serializable;

public class Emprunteur implements Serializable {
    String nom;
    int age;
    public ArrayList<Livre> livreEmprunter;

    public Emprunteur(String nom, int age){
        this.nom = nom;
        this.age = age;
        this.livreEmprunter = new ArrayList<>();
    }

    public void ajouterLivre(Livre l){
        this.livreEmprunter.add(l);
    }

    public void afficher(){
        System.out.println(" Liste des livres emprunter"+this.nom+" :");
        for(Livre l : livreEmprunter){
            l.afficher();
        }
       
    }

}
