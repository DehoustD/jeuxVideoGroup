import help.CommonUserInput;

public class Quiz {

    public static void main(String[] args) {

        // Les variables

        // note de David, il faut créer une fonction pour réinitialisé les variables en cas de nouvelle partie. Au moins les scores.

        int nombreDeJoueurs = 0;

        int nombreDeManche = 3;

        int[] scores = {};

        String[] nomJoueurs = {};

        // Accueil du jeu.

        System.out.println("\nBienvenu dans notre quiz !");

        //On enregistre le ou les joueurs, puis on leurs attribue un score de zéro.

        nombreDeJoueurs = fonctionBruno.NombreJoueur();

        nomJoueurs = fonctionDavid.CreerTableauString(nomJoueurs, nombreDeJoueurs);

        scores = fonctionDavid.CreerTableauInt(scores, nombreDeJoueurs);

        for (int i = 0; i < nomJoueurs.length; i++) {

            nomJoueurs[i] = fonctionBruno.UserName();

            System.out.println("Le nom du joueur = " + nomJoueurs[i] + " avec un score de " + scores[i] + ".");

        }

        System.out.println("\n");

        // fin de l'enregistrement.

        do {

            // On que tous les scores soit bien à zéro.

            fonctionDavid.ScoreAZero(scores);

            // On lance la partie !

            fonctionDavid.UnePartie(nombreDeManche, nombreDeJoueurs, nomJoueurs, scores);

            // On demande si le ou les joueurs veulent rejouer.

        } while (CommonUserInput.AskYesOrNo("voulez-vous rejouer ?"));

        // Message de salutation de fin.

        System.out.println("\nMerci d'avoir joué, bonne journée à vous.");

    }

}