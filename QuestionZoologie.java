public class QuestionZoologie {

    public static String[] PasseQuestionZoologie() {

        String zooQuestion1 = "Combien de pattes ont les chiens ?";

        String zooQuestion2 = "Combien d'oreilles ont les humains ?";

        String zooQuestion3 = "Comment s'apelle l'animal domestique qui ronronne ?";

        String[] tableauQuestionZoologie = { zooQuestion1, zooQuestion2, zooQuestion3 };

        return tableauQuestionZoologie;

    }

    public static String[][] PasseChoixZoologie() {

        String[] zooChoix1 = { "1", "2", "3", "4" };

        String[] zooChoix2 = { "1", "2", "3", "4" };

        String[] zooChoix3 = { "chien", "chat", "lapin", "hamster"};

        String[][] tableauChoixZoologie = { zooChoix1, zooChoix2, zooChoix3 };

        return tableauChoixZoologie;

    }

    public static String[] PasseReponseZoologie(){

        String[] zooReponse1 = {"4", "2", "chat" };

        return zooReponse1;

    }

}