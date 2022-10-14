/**
 * QuestionSport
 */
public class QuestionSport {

	public static String[] PasseQuestionSport() {
		String sportQuestion1 = "Qui a été champion de la Jupiler Pro LLigue saison 2021 - 2022 ?";

		String sportQuestion2 = "Combien de fois Max Verstappen a été champion du monde de F1 ?";

		String sportQuestion3 = "Combien de joueurs est composée une équipe de rugby ?";

		String sportQuestion4 = "Dans quelle écurie de F1 est Luis Hamilton en 2022";

		String[] tableauQuestionSport = {sportQuestion1, sportQuestion2, sportQuestion3, sportQuestion4};

		return tableauQuestionSport;
	}

	public static String[][] PasseChoixSport() {
		String[] sportChoix1 = {"standard", "bruges", "anderlecht", "anvers"};

		String[] sportChoix2 = {"1", "2", "3", "4"};

		String[] sportChoix3 = {"6", "8", "10", "11"};

		String[] sportChoix4 = {"lotus", "redbull", "mercedes", "william"};

		String[][] tableauChoixSport = {sportChoix1, sportChoix2, sportChoix3, sportChoix4};

		return tableauChoixSport;
	}

	public static String[] PasseReponseSport() {

		String[] sportReponseCorrect = {"bruges", "2", "6", "mercedes"};

		return sportReponseCorrect;
	}
}