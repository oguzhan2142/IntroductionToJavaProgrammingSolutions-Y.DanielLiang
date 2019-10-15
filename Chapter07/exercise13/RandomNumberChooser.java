package Chapter07.exercise13;

import java.util.Scanner;

public class RandomNumberChooser {

	public static void main(String[] args) {
		
		int [] number = new int [5];
		System.out.println("enter five numbers :");
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("Random number is " + getRandom(number));
		

	}

	public static int getRandom(int... numbers) {

		int randomNum = (int) (Math.random() * 54) + 1;

		for (int i = 0; i < numbers.length; i++) {
			if (randomNum == numbers[i]) {
				randomNum = (int) (Math.random() * 54) + 1;
				i = 0;
			}
		}

		return randomNum;
	}

}
