package Chapter07.exercise01;

import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int numOfStudents = scan.nextInt();
		int[] score = new int[numOfStudents];

		for (int i = 0; i < numOfStudents; i++) {
			score[i] = scan.nextInt();
		}

		scan.close();

		int bestScore = 0;

		for (int i = 0; i < score.length; i++) {

			if (bestScore < score[i]) {
				bestScore = score[i];
			}

		}

		for (int i = 0; i < score.length; i++) {

			if (score[i] >= bestScore - 10) {
				System.out.println("Student " + i + " score is " + score[i] + " grade is A");
			} else if (score[i] >= bestScore - 20 && score[i] < bestScore - 10) {
				System.out.println("Student " + i + " score is " + score[i] + " grade is B");
			} else if (score[i] >= bestScore - 30 && score[i] < bestScore - 20) {
				System.out.println("Student " + i + " score is " + score[i] + " grade is C");
			} else if (score[i] >= bestScore - 40 && score[i] < bestScore - 30) {
				System.out.println("Student " + i + " score is " + score[i] + " grade is D");
			}else {
				System.out.println("Student " + i + " score is " + score[i] + " grade is F");
			}
			

		}

	}

}
