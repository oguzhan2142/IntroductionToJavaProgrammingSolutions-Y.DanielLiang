package Chapter07.exercise04;

import java.util.Scanner;

public class AnalyzeScores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] score = new int[100];

		System.out.println("Enter scores:");

		score[0] = scan.nextInt();
		int i = 0;
		while (score[i] > 0) {

			score[++i] = scan.nextInt();

		}
		scan.close();
		i = 0;
		int sumOfScores = 0;
		int howManyScores = 0;
		while (score[i] > 0) {
			
			sumOfScores += score[i];
			
			howManyScores++;
			i++;
		}
		
		double average = (double)sumOfScores / howManyScores;
		
		int aboveOrEqualAverage = 0;
		int belowAverage = 0;
		
		for (int j = 0; j < howManyScores; j++) {
			
			if (score[j] >= average) {
				aboveOrEqualAverage++;
			}else {
				belowAverage++;
			}
			
			
		}
		System.out.println("Average is " + average);
		System.out.println(aboveOrEqualAverage + " scores are above or equal to the average");
		System.out.println(belowAverage + " scores are below the average");
		
		
		

	}

}
