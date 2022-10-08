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

        nomJoueurs = fonctionDavid.CreerTableauString(nomJoueurs, nombreJoueurs);

        for (int i = 0; i < nomJoueurs.length; i++) {

            nomJoueurs[i] = fonctionBruno.UserName();

            System.out.println("nom du joueur = " + nomJoueurs[i]);
        }

        //debug pour consulter la liste des joueurs

        for (int i = 0; i < nomJoueurs.length; i++) {

            System.out.println("Debug : nom du joueur " + (i + 1) + " : " + nomJoueurs[i]);

        }

    }

}