public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Bibliotheque rnt = new Bibliotheque("rnt");
        Bds bd1 = new Bds("Naruto","Kishimoto",1995,"Japonais" );
        Journaux j1 = new Journaux("Dua budak bogel","Mstar",2026,"Metro");
        Roman r1 = new Roman("The Odyssey","Homer",133,"Histoire");
        Exemplaire e1 = new Exemplaire("neuf", "rayon A");
        Exemplaire e2 = new Exemplaire("bonne", "rayon B");

        rnt.ajouterLivre(r1);
        rnt.ajouterLivre(j1);
        rnt.ajouterLivre(bd1);

        rnt.affichageListe();

        Emprunteur em1 = new Emprunteur("Hafiz", 20);

        rnt.ajouterEmprenteur(em1);
        em1.ajouterLivre(bd1);
        rnt.affichageListEmprunteur();
        bd1.emprunter();
        bd1.emprunter();

        bd1.ajoutExemplaire(e1);
        bd1.ajoutExemplaire(e2);
        bd1.afficherExemplaire();

        
        
    }
}
