public class QuestionZoologie {

    public static String[] PasseQuestionZoologie() {

        String zooQ1 = "Combien de pattes ont les chiens ?";

        String zooQ2 = "Combien d'oreilles ont les humains ?";

        String zooQ3 = "Comment s'apelle l'animal domestique qui ronronne ?";

        String[] tableauQuestionZoologie = { zooQ1, zooQ2, zooQ3 };

        return tableauQuestionZoologie;

    }

    public static String[][] PasseChoixZoologie() {

        String[] zooC1 = { "1", "2", "3", "4" };

        String[] zooC2 = { "1", "2", "3", "4" };

        String[] zooC3 = { "chien", "chat", "lapin", "hamster"};

        String[][] tableauReponseZoologie = { zooC1, zooC2, zooC3 };

        return tableauReponseZoologie;

    }

    public static String[] PasseReponseZoologie(){

        String[] zooR1 = {"4", "2", "chat" };

        return zooR1;

    }

}