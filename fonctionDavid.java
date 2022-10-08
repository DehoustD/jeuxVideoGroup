public class fonctionDavid {

    // fonction qui ajuste la taille d'un tableau de String a partir d'un tableau vide.
    public static String[] CreerTableauString(String[] _TableauDeBase, int _taille) {

        String[] _tableau = new String[_TableauDeBase.length + _taille];

        for (int i = 0; i < _taille; i++) {

            _tableau[i] = "sans nom";

        }

        return _tableau;
    }

    // fonction qui ajuste la taille d'un tableau de String a partir d'un tableau vide.
    public static int[] CreerTableauInt(int[] _TableauDeBase, int _taille) {

        int[] _tableau = new int[_TableauDeBase.length + _taille];

        for (int i = 0; i < _taille; i++) {

            _tableau[i] = 0;

        }

        return _tableau;
    }
}