public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Bibliotheque rnt = new Bibliotheque("rnt");
        Bds bd1 = new Bds("Naruto","Kishimoto",1995,"Japonais" );
        Journaux j1 = new Journaux("Dua budak bogel","Mstar",2026,"Metro");
        Roman r1 = new Roman("The Odyssey","Homer",133,"Histoire");

        rnt.ajouterLivre(r1);
        rnt.ajouterLivre(j1);
        rnt.ajouterLivre(bd1);

        rnt.affichageListe();

        
    }
}
