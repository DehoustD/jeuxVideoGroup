import java.util.Scanner;

/**
 * FonctionBruno, inclus entre autre, toutes les fonctions utilisant un scanner.
 */
public class fonctionBruno {

	private static Scanner userInput = new Scanner(System.in);

	public static String UserName() {

		System.out.println("entrer votre prénom");

		String _firstName = userInput.nextLine();

		return _firstName;
}

public static int NombreJoueur() {

	System.out.println("Combien aura-t'il de joueurs ? Minimum 1 et maximum 4 joueurs !!");

	int _number = 0;

	do {

		if (userInput.hasNextInt()){

			_number = userInput.nextInt();

			if (_number < 1 ) {
	
				System.out.println("Vous devez jouer au moin à 1 joueur !!");
			}
	
			if (_number > 4) {
	
				System.out.println("Le nombre de joueur maximum est de 4");
			}

		} else {

			System.out.println("Erreur, veuillez répondre par un chiffre.");

			userInput.nextLine();

		}

	} while (_number < 1 || _number > 4);

	userInput.nextLine();

	return _number;
	
}


public static int GenererNbrAleatoire(int _max) {

		int _nbrAleatoire = (int) (Math.random () * (_max + 1));

		return _nbrAleatoire;
	}

	public static String ChoiceThematic () {

		int thematicRandom = GenererNbrAleatoire(3);

		switch (thematicRandom) {
			
			case 0:

			//System.out.println("zoologie");

				return "zoologie";

				case 1:

			//System.out.println("sport");

				return "sport";

				case 2:

			//System.out.println("géographie");

				return "géographie";

				case 3:

			//System.out.println("sciences");

				return "sciences";
		
			default:

				return "ERREUR";
		}
	}

	public static int DuoCarreCash(String _theme) {

        String _responce = "";

        // je demande à l'utilisateur si il veut un duo, un carré ou un cash, et je boucle sur la question jusqu'à ce qu'il me donne une réponse valable.

        do {

            System.out.println("Tapez 1 pour duo, tapez 2 pour carré, tapez 3 pour cash");

            _responce = userInput.nextLine();

        } while ( ! ( _responce.equals("1") || _responce.equals("2") || _responce.equals("3") ) );

        // en fonction de la réponse de l'utilisateur, je retourne 1 pour duo, 2 pour carré, 3 pour cash

            switch (_responce) {

                case "1":

                    System.out.println("vous avez choisis duo.");

                return 1;

                case "2":

                    System.out.println("vous avez choisis carré.");

                return 2;

                case "3":

                    System.out.println("vous avez choisis cash.");

                return 3;

                default:

                    System.err.println("Erreur Dev, problème de switch");

                return 0;

            }

    }

	public static boolean QuestionBoleen(String _question) {

		String _reponse = "";

		while (true) {

			System.out.println(_question + "\nSi oui, tapez oui. Si non, tapez non");

			_reponse = userInput.nextLine();

			if (_reponse.toLowerCase() .equals("oui")) {

				return true;
			}

			else if (_reponse.toLowerCase().equals("non")) {

				return false;
			}

			else {

				System.out.println("Vous devez impérativement marqué oui ou non, veuillez recommencer !");

			//	continue;
			}
		}
	}

	public static String AskString(String _Question) {

        System.out.print("\n" + _Question + "\nVotre Réponse : ");

        String _Responce = userInput.nextLine();

        return _Responce;

    }
}