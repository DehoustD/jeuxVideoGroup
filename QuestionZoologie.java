public class QuestionZoologie {

    public static String[] PasseQuestionZoologie() {

        String zooQuestion1 = "Combien de pattes ont les chiens ?";

        String zooQuestion2 = "Combien d'oreilles ont les humains ?";

        String zooQuestion3 = "Comment s'apelle l'animal domestique qui ronronne ?";

        String zooQuestion4 = "Comment s'apelle l'animal domestique qui ronronne ?";

        String[] tableauQuestionZoologie = { zooQuestion1, zooQuestion2, zooQuestion3, zooQuestion4 };

        return tableauQuestionZoologie;

    }

    public static String[][] PasseChoixZoologie() {

        String[] zooChoix1 = { "1", "2", "3", "4" };

        String[] zooChoix2 = { "1", "2", "3", "4" };

        String[] zooChoix3 = { "chien", "chat", "lapin", "hamster"};

        String[] zooChoix4 = { "chien", "chat", "lapin", "hamster"};

        String[][] tableauChoixZoologie = { zooChoix1, zooChoix2, zooChoix3, zooChoix4 };

        return tableauChoixZoologie;

    }

    public static String[] PasseReponseZoologie(){

        String[] zooReponseCorrect = {"4", "2", "chat", "chat" };

        return zooReponseCorrect;

    }

}