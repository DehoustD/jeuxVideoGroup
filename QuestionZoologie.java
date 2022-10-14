public class QuestionZoologie {

    public static String[] PasseQuestionZoologie() {

        String zooQuestion1 = "Comment s’appelle le mammifère ovipare insolite disposant d'un bec ?";

        String zooQuestion2 = "Quelle genre d'arthropodes sont les tiques ?";

        String zooQuestion3 = "Lequel de ces félins ronronne ?";

        String zooQuestion4 = "Quelle oiseaux a la réputation d'être le plus dangereux connu au monde ?";

        String zooQuestion5 = "L'orque, également appelé épaulard, fait partie de quelle famille ? ";

        String[] tableauQuestionZoologie = { zooQuestion1, zooQuestion2, zooQuestion3, zooQuestion4, zooQuestion5 };

        return tableauQuestionZoologie;

    }

    public static String[][] PasseChoixZoologie() {

        String[] zooChoix1 = { "échidné", "ornithorynque", "Tatou", "fourmilier" };

        String[] zooChoix2 = { "insecte", "myriapode", "crustacé", "arachnide" };

        String[] zooChoix3 = { "lion", "jaguar", "guépard", "tigre"};

        String[] zooChoix4 = { "aigle", "autruche", "émeu", "casoar"};

        String[] zooChoix5 = { "baleine", "requin", "marsouin", "dauphin"};

        String[][] tableauChoixZoologie = { zooChoix1, zooChoix2, zooChoix3, zooChoix4, zooChoix5 };

        return tableauChoixZoologie;

    }

    public static String[] PasseReponseZoologie(){

        String[] zooReponseCorrect = {"ornithorynque", "arachnide", "guépard", "casoar", "dauphin" };

        return zooReponseCorrect;

    }

}