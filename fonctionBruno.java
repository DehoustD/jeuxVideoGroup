import java.util.Scanner;

/**
 * fonctionBruno
 */
public class fonctionBruno {

	public static Scanner userInput = new Scanner(System.in);

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


	return _number;
}
}