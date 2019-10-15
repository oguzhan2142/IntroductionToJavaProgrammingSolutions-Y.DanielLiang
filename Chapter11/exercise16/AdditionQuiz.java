package Chapter11.exercise16;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		// Create a Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = scan.nextInt();
		ArrayList<Integer> beforeAnswers = new ArrayList<Integer>();
		
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			if (isAnswerInList(beforeAnswers, answer)) {
				System.out.println("You already entered " + answer);
			}
			beforeAnswers.add(answer);
			answer = scan.nextInt();
			

		}
		scan.close();
		System.out.println("You got it!");

	}
	
	public static boolean isAnswerInList(ArrayList<Integer> list , int answer) {
		
		
		for (int i = 0; i < list.size(); i++) {
			if (answer == list.get(i)) {
				return true;
			}
		}
		return false;
		
	}

}
