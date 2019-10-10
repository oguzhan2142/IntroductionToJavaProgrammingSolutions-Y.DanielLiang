package Chapter05.exercise08;

import java.util.Scanner;

public class FindTheHighestScore {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numberOfStudents = scan.nextInt();

		String[] name = new String[numberOfStudents];
		int[] score = new int[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			name[i] = scan.next();
			score[i] = scan.nextInt();

		}

		scan.close();

		for (int j = 0; j < numberOfStudents; j++) {

			for (int i = 0; i < numberOfStudents - 1; i++) {

				if (score[i] > score[i + 1]) {
					int temp = 0;

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
		System.out.println("higestScore:" + name[numberOfStudents - 1]);

	}
}