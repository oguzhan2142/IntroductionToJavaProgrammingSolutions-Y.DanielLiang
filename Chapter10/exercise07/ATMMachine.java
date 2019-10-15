package Chapter10.exercise07;

import java.util.Scanner;

import Chapter09.exercise07.Account;

public class ATMMachine {

	public static void main(String[] args) {

		Account[] account = new Account[10];

		for (int i = 0; i < account.length; i++) {
			account[i] = new Account(i, 100);

		}

		Scanner scan = new Scanner(System.in);
		boolean isGameContinue = true;
		while (isGameContinue) {
			
		
		
		System.out.println("Enter an id:");
		int id = scan.nextInt();
		
		if (id < 0 || id >= account.length) {
			System.err.println("incorrect id");
			continue;
		}
		
		printMenu();
		System.out.println("enter a choice:");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("The balance is " + account[id].getBalance());
			break;
			
		case 2:
		System.out.println("Enter amount to withdraw:");
		double withdrawAmount = scan.nextDouble();
		account[id].withdraw(withdrawAmount);
		break;
		
		case 3:
			System.out.println("Enter amount to deposit:");
			double deposit = scan.nextDouble();
			account[id].deposit(deposit);
			break;
		case 4:
			isGameContinue = false;
			break;
		default:
			break;
		}
		
		
		
		}
		
		
		scan.close();
		

	}
	
	
	
	public static void printMenu() {
		
		
		System.out.println("Main Menu:");
		System.out.println("1:check balance");
		System.out.println("2:withdraw");
		System.out.println("3:deposit");
		System.out.println("4:exit");
		
		
		
	}

}
