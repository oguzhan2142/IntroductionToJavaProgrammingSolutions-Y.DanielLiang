package Chapter08.exercise17;

import java.util.Scanner;

public class FinancialTsunami {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of banks;");
		int numOfBanks = scan.nextInt();
		System.out.println("Enter minimum total assets for keeping a bank safe.");
		int limit = scan.nextInt();

		int[][] borrowers = new int[numOfBanks][];

		for (int i = 0; i < borrowers.length; i++) {

			System.out.println("enter number of borrowers of bank " + i);
			int numOfBorrowers = scan.nextInt();
			borrowers[i] = new int[numOfBorrowers * 2 + 1];

			System.out.println("for bank " + i + " Enter values bank amount, " + numOfBorrowers + " borrower id, "
					+ numOfBorrowers + " borrowed amount " + " sequentially ");
			for (int j = 0; j < borrowers[i].length; j++) {
				int value = scan.nextInt();
				borrowers[i][j] = value;

			}

		}

		scan.close();

		System.out.print("Unsafe banks are ");
		for (int i = 0; i < borrowers.length; i++) {
			if (isSafe(borrowers, i, limit)) {
				System.out.print(i + " ");
			}
		}

	}

	public static int calculateTotalAssetsOfBank(int[][] borrowers, int bankNum) {
		int totalAsset = 0;

		for (int j = 0; j < borrowers[bankNum].length; j++) {

			if (j % 2 == 0) {

				borrowers[bankNum][j] = totalAsset;
			}

		}
		return totalAsset;

	}

	public static boolean isSafe(int[][] borrowers, int bankNum, int limit) {

		if (calculateTotalAssetsOfBank(borrowers, bankNum) < limit) {
			return false;
		}
		return true;

	}

}
