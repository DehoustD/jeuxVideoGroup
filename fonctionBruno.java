import java.util.Scanner;

/**
 * fonctionBruno
 */
public class fonctionBruno {

	private static Scanner userInput = new Scanner(System.in);

	public static String UserName() {

		System.out.println(" entrer votre prénom");

		String _firstName = userInput.nextLine();

		return _firstName;
}

public static int NombreJoueur() {

	System.out.println(" combien y aura-t-il de joueurs ? Minimum 1 joueur et maximum 4");

//	int _number = userInput.nextInt();

int _number;

do {
	
	_number = userInput.nextInt();

	if (_number <1 ) {

		System.out.println("Vous devez jouer au moin à un joueur !!");
	}

	if (_number > 4) {

		System.out.println("Le nombre de joueur maximum est de 4");
	}
}
// fermeture do

while (_number < 1 || _number > 4);

userInput.nextLine();


	return _number;
}


public static int GenererNbrAleatoire(int _max) {

		int _nbrAleatoire = (int) (Math.random () * (_max + 1));

		return _nbrAleatoire;
	}

	public static String ChoiceThematic () {

		int thematicRandom = GenererNbrAleatoire(2);

		switch (thematicRandom) {
			case 0:

			System.out.println("zoologie");
				return "zoologie";

				case 1:

			System.out.println("sport");
				return "sport";

				case 2:

			System.out.println("géographie");
				return "géographie";
		
			default:
				return "ERREUR";
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
}