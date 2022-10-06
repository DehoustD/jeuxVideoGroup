public class Quiz {
    public static void main(String[] args) {

        // Les variables

        int nombreJoueurs = 0;

        String[] nomJoueurs = {};

        //boolean partieEnCour = false;




        System.out.println("Bienvenu dans notre quiz");

        System.out.println("combien de joueur êtes-vous?");

        // fonction qui demande un nombre
        nombreJoueurs = fonctionBruno.NombreJoueur();

        nomJoueurs = fonctionDavid.creerTableauString(nomJoueurs, nombreJoueurs);

        for (int i = 0; i < nomJoueurs.length; i++) {
            // fonction qui permet d'enregistrer un nom
        }

        // debug pour consulter la liste des joueurs
        for (int i = 0; i < nomJoueurs.length; i++) {
            System.out.println(nomJoueurs[i]);
        }

        System.out.println("Entrez votre nom");
    }
}