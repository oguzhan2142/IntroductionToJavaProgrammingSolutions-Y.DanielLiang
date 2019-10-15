package Chapter05.exercise34;

import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {
		int computerWins = 0;
		int humanWins = 0;
		boolean isGameOver = false;
		Scanner scan = new Scanner(System.in);
		
		while (!isGameOver) {
			
			

			System.out.println("scissor (0), rock (1), paper (2):");

			int computerGuesses = (int) (Math.random() * 3);
			int chooise = scan.nextInt();

			String computerChoise = null;
			String humanChoise = null;

			switch (computerGuesses) {
			case 0:
				computerChoise = "scissor";
				break;
			case 1:
				computerChoise = "rock";
				break;
			case 2:
				computerChoise = "paper";
				break;

			default:
				break;
			}

			switch (chooise) {
			case 0:
				humanChoise = "scissor";
				break;
			case 1:
				humanChoise = "rock";
				break;
			case 2:
				humanChoise = "paper";
				break;

			default:
				break;
			}

			if (computerGuesses == chooise) {
				System.out.println("draw");
			} else {
				if (chooise == 0 && computerGuesses == 1) {
					System.out.println("The computer is " + computerChoise + ". You are " + humanChoise + ". You lost");
					computerWins++;
				} else if (chooise == 0 && computerGuesses == 2) {
					System.out.println("The computer is " + computerChoise + ". You are " + humanChoise + ". You won");
					humanWins++;
				} else if (chooise == 1 && computerGuesses == 0) {
					System.out.println("The computer is " + computerChoise + ". You are " + humanChoise + ". You won");
					humanWins++;
				} else if (chooise == 1 && computerGuesses == 2) {
					System.out.println("The computer is " + computerChoise + ". You are " + humanChoise + ". You lost");
					computerWins++;
				} else if (chooise == 2 && computerGuesses == 0) {
					System.out.println("The computer is " + computerChoise + ". You are " + humanChoise + ". You lost");
					computerWins++;
				} else if (chooise == 2 && computerGuesses == 1) {
					System.out.println("The computer is " + computerChoise + ". You are " + humanChoise + ". You won");
					humanWins++;
				}
			}
			
			if (humanWins == 3 || computerWins ==3) {
				isGameOver = true;

			if (humanWins == 3) {
				System.out.println("\nYou win the game");
			}
			else {
				System.out.println("\nComputer win the game");
			}
			}
			
			

		}
		scan.close();
	}

}
