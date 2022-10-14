/**
 * QuestionSciences
 */
public class QuestionSciences {

	public static String[] PasseQuestionSciences() {
		String sciencesQuestion1 = "Combien y a-t-il d'os dans le corps humain ?";

		String sciencesQuestion2 = "Une personne adulte bien constitué, combien a-t'elle de dents ?";

		String sciencesQuestion3 = "quel est l'os le plus grand du corps humain";

		String[] tableauQuestionSciences = {sciencesQuestion1, sciencesQuestion2, sciencesQuestion3};

		return tableauQuestionSciences;
	}

	public static String[][] PasseChoixSciences() {

		String[] sciencesChoix1 = {"12", "186", "206", "384"};

		String[] sciencesChoix2 = {"20", "28", "32", "35"};

		String[] sciencesChoix3 = {"radius", "femur", "cubitus", "genoux"};

		String[][] tableauChoixSciences = {sciencesChoix1, sciencesChoix2, sciencesChoix3};

		return tableauChoixSciences;
	}

	public static String[] PasseReponseSciences() {

		String[] sciencesReponseCorrect = {"206", "32", "femur"};

		return sciencesReponseCorrect;
	}
}