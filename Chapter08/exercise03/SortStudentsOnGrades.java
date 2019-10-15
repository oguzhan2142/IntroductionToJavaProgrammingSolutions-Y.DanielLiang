package Chapter08.exercise03;

public class SortStudentsOnGrades {

	public static void main(String[] args) {

		// Students' answers to the questions
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		int[] studentsCorrectAnswers = new int[8];
		int[] studentsIndex = new int[8];
		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}

			studentsIndex[i] = i;
			studentsCorrectAnswers[i] = correctCount;
		}
		
		sortStudentsAndCorrectAnswers(studentsIndex, studentsCorrectAnswers);

		
		for (int i = 0; i < studentsIndex.length; i++) {
			
			System.out.println("Student " + studentsIndex[i] + "`s correct count is " + studentsCorrectAnswers[i]);
			
		}
	}

	public static void sortStudentsAndCorrectAnswers(int[] studentsIndex, int[] answers) {

		for (int i = 0; i < answers.length; i++) {

			for (int j = 0; j < answers.length - 1; j++) {

				if (answers[j] > answers[j + 1]) {
					int tempAnswer = answers[j + 1];
					answers[j + 1] = answers[j];
					answers[j] = tempAnswer;

					int tempStudentsIndex = studentsIndex[j + 1];
					studentsIndex[j + 1] = studentsIndex[j];
					studentsIndex[j] = tempStudentsIndex;

				}

			}

		}

	}
}
