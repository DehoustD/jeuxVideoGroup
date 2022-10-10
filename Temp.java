import java.util.Scanner;

public class Temp {

    private static Scanner _input = new Scanner(System.in);

    static int GenerateRandomNumber(int _max) {

        int _random = (int) (Math.random() * (_max + 1));

        return _random;

    }

    public static String IAchoisiTheme() {

        String[] _themes = { "science", "cinema", "sport" };

        int _themeID = GenerateRandomNumber(_themes.length-1);

        System.out.println("Votre thème sera " + _themes[_themeID] + ", comment allez-vous répondre ? duo, carré ou cash ?");

        return _themes[_themeID];

    }

    public static String DuoCarreCash(String _theme) {

        String _responce = "";

        do {

            System.out.println("Tapez 1 pour duo, tapez 2 pour carré, tapez 3 pour cash");

            _responce = _input.nextLine();

        } while ( ! ( _responce.equals("1") || _responce.equals("2") || _responce.equals("3") ) );

            switch (_responce) {

                case "1":

                    System.out.println("vous avez choisis duo.");

                return "1";

                case "2":

                    System.out.println("vous avez choisis carré.");

                return "2";

                case "3":

                    System.out.println("vous avez choisis cash.");

                return "3";

                default:

                    System.err.println("Erreur Dev, problème de switch");

                return "0";

            }

        

    }

}
