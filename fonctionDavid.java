import help.CommonUserInput;

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

                int _duoCarreCash = Temp.DuoCarreCash(_theme);

                String[] _questionTableau = RecuperationTableauQuestion(_theme);

                String[][] _choixTableau = RecuperationTableauChoix(_theme);

                String[] _reponseTableau = RecuperationTableauReponse(_theme);

                int _idQuestion = fonctionBruno.GenererNbrAleatoire(_questionTableau.length-1);

                boolean _bonneReponse = Question(_questionTableau[_idQuestion], _choixTableau[_idQuestion], _reponseTableau[_idQuestion], _duoCarreCash);

                if (_bonneReponse) {

                    _scores[i] = _scores[i] + DefinirNombreDePoints(_duoCarreCash);

                    System.out.println("Bravo, vous avez " + DefinirNombreDePoints(_duoCarreCash) + " point(s) suplémentaire.");

                    System.out.println("Vous avez donc " + _scores[i] + " points.\n");

                } else {

                    System.out.println("Désolé, ce n'est pas la bonne réponse, la bonne réponse était : " + _reponseTableau[_idQuestion] + ".");

                }

            }

            _mancheActuelle++;

            System.out.println("manche numéro " + _mancheActuelle + " terminée.\n");

        }

        System.out.println("La partie est terminée !\n");

    }

    // fonction qui va chercher un tableau de question en fonction du thème choisis par l'ordinateur.

    public static String[] RecuperationTableauQuestion(String _theme){

        switch (_theme) {

            case "sciences":

                return QuestionZoologie.PasseQuestionZoologie();

            case "culture général":
    
                return QuestionZoologie.PasseQuestionZoologie();

            case "géographie":

                return QuestionGeographie.PasseQuestionGeographie();

            default:

                System.err.println("ERROR DEV : FonctionDavid > String RecuperationTableauQuestion > switch : la String semble mauvaise.");

                return QuestionZoologie.PasseQuestionZoologie();

        }

    }

    // fonction qui va chercher un tableau de choix en fonction du thème choisis par l'ordinateur.

    public static String[][] RecuperationTableauChoix(String _theme){

        switch (_theme) {

            case "sciences":

                return QuestionZoologie.PasseChoixZoologie();

            case "culture général":

                return QuestionZoologie.PasseChoixZoologie();

            case "géographie":

                return QuestionGeographie.PasseChoixGeographie();

            default:

                System.err.println("ERROR DEV : FonctionDavid > String RecuperationTableauChoix > switch : la String semble mauvaise.");

                return QuestionZoologie.PasseChoixZoologie();

        }

    }

    //

    public static String[] RecuperationTableauReponse(String _theme){

        switch (_theme) {

            case "sciences":

                return QuestionZoologie.PasseReponseZoologie();

            case "culture général":

                return QuestionZoologie.PasseReponseZoologie();

            case "géographie":

                return QuestionGeographie.PasseReponseGeographie();

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

            System.out.println("Navré, actuellement, le duo fonctionne comme un carré pour cause de soucis d'algorithmique.");

            for (int i = 0; i < _choix.length; i++) {

                System.out.println(_choix[i]);

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

        String utilisateurReponse = CommonUserInput.AskString("Veuillez inscrire la bonne réponse.");

        if (utilisateurReponse.equals(_reponse)) {

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

    // fonction qui permet à l'ordinateur de choisir un thème aléatoire (Obsolète, voir fichier fonctionBruno).

    // public static void IAchoisisQuestion (String _theme){

    //     switch (_theme) {

    //         case "science":

    //             break;

    //         case "culture général":

    //             break;

    //         case "géographie":

    //             break;

    //         default: 

    //             System.out.println("ERREUR");

    //             break;

    //     }

    // }

}