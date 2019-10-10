package Chapter06.exercise17;

import java.util.Scanner;

public class DisplayMatrixOf0sAnd1s {

	public static void main(String[] args) {

		System.out.println("enter n for matrix");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		printMatrix(n);
		scan.close();
		
		
		
		
		
	}
	
	public static void printMatrix(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				int randomNum = (int)(Math.random() * 2) ;
				System.out.print(randomNum + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
