import help.CommonUserInput;

public class Quiz {
    public static void main(String[] args) {

        // Les variables

        int nombreJoueurs = 0;

        int nombreDeManche = 3;

        int mancheActuelle = 0;

        int[] scores = {};

        String[] nomJoueurs = {};

        //boolean partieEnCour = false;

        System.out.println("Bienvenu dans notre quiz");

        System.out.println("Combien de joueur êtes-vous?");

        nombreJoueurs = fonctionBruno.NombreJoueur();

        nomJoueurs = fonctionDavid.CreerTableauString(nomJoueurs, nombreJoueurs);

        scores = fonctionDavid.CreerTableauInt(scores, nombreJoueurs);

        for (int i = 0; i < nomJoueurs.length; i++) {

            nomJoueurs[i] = fonctionBruno.UserName();

            System.out.println("nom du joueur = " + nomJoueurs[i] + " avec un score de " + scores[i] + ".");

        }

        while (mancheActuelle < nombreDeManche) {

            for (int i = 0; i < nombreJoueurs; i++) {

                System.out.println("le joueur " + nomJoueurs[i] + " joue.");

                //Temp.DuoCarreCash(Temp.IAchoisiTheme());

                // fonction de Bruno

                Temp.DuoCarreCash(fonctionBruno.ChoiceThematic());

            }

            mancheActuelle++;

            System.out.println("manche numéro " + mancheActuelle + " terminée.");

        }

        System.out.println("La partie est terminée");

        if (CommonUserInput.AskYesOrNo("voulez-vous rejouer ?")) {

            System.out.println("DEBUG : on rejoue");

        } else {

            System.out.println("DEBUG : on quite le jeu");

        }

    }

}