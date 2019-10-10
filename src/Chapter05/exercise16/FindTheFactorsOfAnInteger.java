package Chapter05.exercise16;

import java.util.Scanner;

public class FindTheFactorsOfAnInteger {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		int num = scan.nextInt();
		
		scan.close();
		
		int devisor = 2;
		
		
		while (num > 1) {
			
			if (num % devisor == 0) {
				num =num / devisor;
				System.out.print(devisor + " ");
				continue;
			}
			
			devisor++;
			
		}
		
		
		
	}

}
