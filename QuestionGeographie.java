public class QuestionGeographie {

    public static String[] PasseQuestionGeographie() {

        String geoQuestion1 = "Quelle est la montagne la plus élevée du monde ?";

        String geoQuestion2 = "Laquelle de ces villes est la capitale de l'Union européenne ?";

        String geoQuestion3 = "Quelle langue parle-t-on en Argentine ?";

        String[] tableauQuestionGeographie = { geoQuestion1, geoQuestion2, geoQuestion3 };

        return tableauQuestionGeographie;

    }

    public static String[][] PasseChoixGeographie() {

        String[] geoChoix1 = { "Makalu", "Manaslu", "Everest", "Kilimandjaro" };

        String[] geoChoix2 = { "Paris", "Bruxelles", "Berlin", "Londres" };

        String[] geoChoix3 = { "Français", "Italien", "Espagnol", "Portugais"};

        String[][] tableauChoixGeographie = { geoChoix1, geoChoix2, geoChoix3 };

        return tableauChoixGeographie;

    }

    public static String[] PasseReponseGeographie(){

        String[] geoReponseCorrect = {"Everest", "Bruxelles", "Espagnol" };

        return geoReponseCorrect;

    }

}