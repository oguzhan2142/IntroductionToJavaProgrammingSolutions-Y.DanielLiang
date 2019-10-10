package Chapter03.exercise17;

import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {

		
		
		
		System.out.println("scissor (0), rock (1), paper (2):");
		Scanner scan = new Scanner(System.in);
		
		int computerGuesses = (int)(Math.random() * 3);
		int chooise = scan.nextInt();
		scan.close();
		
		
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
		}
		else {
			if (chooise == 0 && computerGuesses == 1) {
				System.out.println("The computer is " + computerChoise + ". You are "+ humanChoise + ". You lost");
			}
			else if (chooise == 0 && computerGuesses ==2) {
				System.out.println("The computer is " + computerChoise + ". You are "+ humanChoise + ". You won");
			}
			else if (chooise == 1 && computerGuesses == 0) {
				System.out.println("The computer is " + computerChoise + ". You are "+ humanChoise + ". You won");
			}
			else if (chooise == 1 && computerGuesses == 2) {
				System.out.println("The computer is " + computerChoise + ". You are "+ humanChoise + ". You lost");
			}
			else if (chooise == 2 && computerGuesses == 0) {
				System.out.println("The computer is " + computerChoise + ". You are "+ humanChoise + ". You lost");
			}
			else if (chooise == 2 && computerGuesses == 1) {
				System.out.println("The computer is " + computerChoise + ". You are "+ humanChoise + ". You won");
			}
		}
		
		
		
		
	}

}
