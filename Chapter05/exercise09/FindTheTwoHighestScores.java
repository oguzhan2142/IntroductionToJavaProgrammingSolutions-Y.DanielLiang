package Chapter05.exercise09;

import java.util.Scanner;

public class FindTheTwoHighestScores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter number of students:");
		int numberOfStudents = scan.nextInt();

		String[] name = new String[numberOfStudents];
		int[] score = new int[numberOfStudents];
		int firstScorerIndex = 0;
		int secondScorerIndex = 0;

		for (int i = 0; i < numberOfStudents; i++) {
			// System.out.println("enter name:");
			// name[i] = scan.next();
			name[i] = "name" + i;
			// System.out.println("enter score::");
			// score[i] = scan.nextInt();
			score[i] = (int) (Math.random() * 100);

		}

		scan.close();

		// for test
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(name[i] + " score: " + score[i]);
		}


		
		for (int j = 0; j < numberOfStudents; j++) {
			
			
			for (int i = 0; i < numberOfStudents - 1; i++) {
				
				if (score[i] > score[i + 1]) {
					int temp = 0 ;
					
					temp = score[i + 1];
					score[i + 1] = score[i];
					score[i] = temp;
					
					String temp2 = "";
					temp2 = name[i + 1];
					name[i + 1] = name[i];
					name[i] = temp2;
					
					
				}
				
			}
		}
		
		
		

		System.out.println("first:" + name[numberOfStudents - 1] );
		System.out.println("second:" + name[numberOfStudents - 2]);
		
		
	}

}
