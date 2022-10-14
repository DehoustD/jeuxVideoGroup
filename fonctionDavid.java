/**
 * fonction diverse, inclus entre autre, les fonctions liées aux jeu en lui même.
 */
public class fonctionDavid {

    // fonction qui ajuste la taille d'un tableau de String a partir d'un tableau vide.

    public static String[] CreerTableauString(String[] _TableauDeBase, int _taille) {

        String[] _tableau = new String[_TableauDeBase.length + _taille];

        for (int i = 0; i < _taille; i++) {

            _tableau[i] = "sans nom";

        }

        return _tableau;

    }

    // fonction qui ajuste la taille d'un tableau de int a partir d'un tableau vide.

    public static int[] CreerTableauInt(int[] _TableauDeBase, int _taille) {

        int[] _tableau = new int[_TableauDeBase.length + _taille];

        for (int i = 0; i < _taille; i++) {

            _tableau[i] = 0;

        }

        return _tableau;

    }

        // fonction qui ramène toutes les valeurs du tableau scores à zéro.

    public static int[] ScoreAZero (int[] _scores){

        for (int i = 0; i < _scores.length; i++) {

            _scores[i] = 0;

        }

        return _scores;

    }

    // fonction qui gère l'intégralité d'une partie. Comprenant tous les tours des joueurs, et les différentes manches.

    public static void UnePartie(int _nombreDeManche, int _nombreDeJoueur, String[] _nomJoueur, int[] _scores){

        int _mancheActuelle = 0;

        while (_mancheActuelle < _nombreDeManche) {

            for (int i = 0; i < _nombreDeJoueur; i++) {

                System.out.println(_nomJoueur[i] + " joue.");

                String _theme = fonctionBruno.ChoiceThematic();

                System.out.println("Votre thème est : " + _theme + ".");

                int _duoCarreCash = fonctionBruno.DuoCarreCash(_theme);

                String[] _questionTableau = RecuperationTableauQuestion(_theme);

                String[][] _choixTableau = RecuperationTableauChoix(_theme);

                String[] _reponseTableau = RecuperationTableauReponse(_theme);

                int _idQuestion = fonctionBruno.GenererNbrAleatoire(_questionTableau.length-1);

                boolean _bonneReponse = fonctionDavid.Question(_questionTableau[_idQuestion], _choixTableau[_idQuestion], _reponseTableau[_idQuestion], _duoCarreCash);

                if (_bonneReponse) {

                    _scores[i] = _scores[i] + fonctionDavid.DefinirNombreDePoints(_duoCarreCash);

                    System.out.println("Bravo, vous avez " + fonctionDavid.DefinirNombreDePoints(_duoCarreCash) + " point(s) suplémentaire.");

                    System.out.println("Vous avez donc " + _scores[i] + " points.\n");

                } else {

                    System.out.println("Désolé, ce n'est pas la bonne réponse, la bonne réponse était : " + _reponseTableau[_idQuestion] + ".\n");

                }

            }

            _mancheActuelle++;

            System.out.println("Manche numéro " + _mancheActuelle + " terminée.\n");

        }

        System.out.println("La partie est terminée !\n");

    }

    // fonction qui va chercher un tableau de question en fonction du thème choisis par l'ordinateur.

    public static String[] RecuperationTableauQuestion(String _theme){

        switch (_theme) {

            case "zoologie":

                return QuestionZoologie.PasseQuestionZoologie();

            case "sport":
    
                return QuestionSport.PasseQuestionSport();

            case "géographie":

                return QuestionGeographie.PasseQuestionGeographie();

			case "sciences":

                return QuestionSciences.PasseQuestionSciences();

            default:

                System.err.println("ERROR DEV : FonctionDavid > String RecuperationTableauQuestion > switch : la String semble mauvaise.");

                return QuestionZoologie.PasseQuestionZoologie();

        }

    }

    // fonction qui va chercher un tableau de choix en fonction du thème choisis par l'ordinateur.

    public static String[][] RecuperationTableauChoix(String _theme){

        switch (_theme) {

            case "zoologie":

                return QuestionZoologie.PasseChoixZoologie();

            case "sport":

                return QuestionSport.PasseChoixSport();

            case "géographie":

                return QuestionGeographie.PasseChoixGeographie();

			case "sciences":

                return QuestionSciences.PasseChoixSciences();

            default:

                System.err.println("ERROR DEV : FonctionDavid > String RecuperationTableauChoix > switch : la String semble mauvaise.");

                return QuestionZoologie.PasseChoixZoologie();

        }

    }

    //

    public static String[] RecuperationTableauReponse(String _theme){

        switch (_theme) {

            case "zoologie":

                return QuestionZoologie.PasseReponseZoologie();

            case "sport":

                return QuestionSport.PasseReponseSport();

            case "géographie":

                return QuestionGeographie.PasseReponseGeographie();

			case "sciences":

                return QuestionSciences.PasseReponseSciences();

            default:

                System.err.println("ERROR DEV : FonctionDavid > String RecuperationTableauReponse > switch : la String semble mauvaise.");

                return QuestionZoologie.PasseReponseZoologie();

        }

    }

    // fonction qui gère le fait de poser une question à un joueur.

    public static boolean Question(String _question, String[] _choix, String _reponse, int _duoCarreCash) {

        System.out.println(_question);

        switch (_duoCarreCash) {

            case 1:

            // nombre compris entre 0 et 1 déterminant si la bonne réponse sera en première ou en seconde position.
 
            int _reponseCorrectePosition = fonctionBruno.GenererNbrAleatoire(1);

            String _ReponseFausse = "";

            do {

                _ReponseFausse = _choix[fonctionBruno.GenererNbrAleatoire(_choix.length-1)];
                
            } while (_ReponseFausse.equals(_reponse));

            if (_reponseCorrectePosition == 0) {

                System.out.println(_reponse);

                System.out.println(_ReponseFausse);
                
            } else {

                System.out.println(_ReponseFausse);

                System.out.println(_reponse);
                
            }

                break;

            case 2:

            // carré

            for (int i = 0; i < _choix.length; i++) {

                System.out.println(_choix[i]);

            }

                break;

            case 3:

            // cash

                break;

            default:

                System.err.println("ERROR DEV : FonctionDavid > Void Question > switch : la réponse doit être 1, 2 ou 3.");

                break;

        }

        String utilisateurReponse = fonctionBruno.AskString("Veuillez inscrire la bonne réponse.");

        if (utilisateurReponse.toLowerCase().equals(_reponse.toLowerCase())) {

            return true;

        } else {

            return false;

        }

    }

    // fonction qui détermine le nombre de point d'une question en fonction du choix duo, carré ou cash.

    public static int DefinirNombreDePoints(int _duoCarreCash) {

        switch (_duoCarreCash) {

            case 1:

                return 1;

            case 2:

                return 3;

            case 3:

                return 5;

            default:

            System.err.println("ERROR DEV : FonctionDavid > int DefinirNombreDePoints > switch : la réponse doit être 1, 2 ou 3.");

                return 0;

        }

    }

    // fonction qui récapitule les points des joueurs en fin de partie.

    public static void RecapitulatifPoints(String[] _nomJoueur, int[] _scores){

        for (int i = 0; i < _nomJoueur.length; i++) {

            System.out.println("le score de " + _nomJoueur[i] + " est de : " + _scores[i] + "." );
            
        }

        System.out.print("\n");

    }
}