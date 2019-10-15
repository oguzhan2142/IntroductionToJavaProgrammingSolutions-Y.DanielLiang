package Chapter08.exercise04;

public class ComputeTheWeeklyHoursForEachEmployee {
	public static void main(String[] args) {

		int[][] workingHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 7 },

		};

		int[] sumOfWeek = new int[8];

		for (int i = 0; i < workingHours.length; i++) {

			for (int j = 0; j < workingHours[i].length; j++) {

				sumOfWeek[i] += workingHours[i][j];

			}

		}
		
		
		for (int i = 0; i < sumOfWeek.length; i++) {
			System.out.println(sumOfWeek[i]);
			
		}
		
		
	}
}
