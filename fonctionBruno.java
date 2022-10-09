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

			System.out.println("sciences");
				return "sciences";

				case 1:

			System.out.println("culture générale");
				return "culture général";

				case 2:

			System.out.println("géographie");
				return "géographie";
		
			default:
				return "ERREUR";
		}
	}
}