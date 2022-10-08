public class fonctionDavid {

    public static String[] CreerTableauString(String[] _TableauDeBase, int _taille){

        String[] _tableau = new String [_TableauDeBase.length + _taille];

        for (int i = 0; i < _taille; i++) {

            _tableau[i] = "sans nom";
            
        }

        return _tableau;
    }
}