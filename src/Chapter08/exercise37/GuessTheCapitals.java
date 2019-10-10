package Chapter08.exercise37;

import java.util.Scanner;

public class GuessTheCapitals {

	public static void main(String[] args) {

		String[][] statesAndCapitals = {

				{ "Alaska", "Juneau" }, { "Alabama", "Montgomery" }, { "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
				{ "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" }, { "Kansas", "Topeka" }

		};


			
			
			Scanner scan = new Scanner(System.in);
			
			int correctCount = 0 ;
		
			for (int i = 0; i < statesAndCapitals.length; i++) {

				System.out.println("What is the capital of " + statesAndCapitals[i][0]);
				String answer = scan.next();
				answer = answer.toLowerCase();
				if (answer.equals(statesAndCapitals[i][1].toLowerCase()) ) {
					System.out.println("Your answer is correct");
					correctCount++;
				}else {
					System.out.println("The correct answer should be " + statesAndCapitals[i][1]);
				}

			}
			
			System.out.println("The correct count is " + correctCount);
			scan.close();


	}
	
	
		
		
		
		
		

}
