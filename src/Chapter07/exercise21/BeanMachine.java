package Chapter07.exercise21;

import java.util.Scanner;

public class BeanMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of balls to drop:");
		int numberOfBalls = scan.nextInt();
		System.out.println("Enter the number of slots in the bean machine:");
		int numberOfSlots = scan.nextInt();
		scan.close();
		
		game(numberOfBalls, numberOfSlots);
		

	}

	public static void game(int numberOfBalls, int numberOfSlots) {

		int[] slots = new int[numberOfSlots];

		for (int i = 0; i < numberOfBalls; i++) {

			int randomPath = randomPathGenerator(numberOfSlots);

			slots[randomPath]++;

		}
		displayResult(slots);

	}

	public static int randomPathGenerator(int numberOfSlots) {

		char[] path = new char[numberOfSlots - 1];

		for (int i = 0; i < path.length; i++) {
			int randomNum = (int) (Math.random() * 2);

			if (randomNum == 1) {
				path[i] = 'R';
			} else {
				path[i] = 'L';
			}

		}

		int rCounter = 0;
		for (int i = 0; i < path.length; i++) {
			if (path[i] == 'R') {
				rCounter++;
			}
		}

		return rCounter;

	}
	public static void displayResult(int[] slots) {
		
		
		for (int i = 0; i < slots.length; i++) {
			System.out.print( i + ".slot:"  + slots[i] + "  ");
		}
		
		
	}

}
