package Chapter07.exercise17;

import java.util.Scanner;

public class SortStudents {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of studens:");
		int numOfStudents = scan.nextInt();
		int[] score = new int[numOfStudents];
		String[] name = new String[numOfStudents];

		for (int i = 0; i < numOfStudents; i++) {

			System.out.println("Enter " + i + ". student's name:");
			name[i] = scan.next();
			System.out.println("Enter " + i + ". student's score:");
			score[i] = scan.nextInt();
		}
		scan.close();

		sortNamesDecreasingOrder(name, score);
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}

	}

	public static void sortNamesDecreasingOrder(String[] name, int[] score) {

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {

				if (score[i] > score[j]) {
					int temp = score[j];
					score[j] = score[i];
					score[i] = temp;

					String tempStr = name[j];
					name[j] = name[i];
					name[i] = tempStr;

				}

			}
		}

	}

}
