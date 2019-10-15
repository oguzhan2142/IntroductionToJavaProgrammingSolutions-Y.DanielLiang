package Chapter12.exercise03;

import java.util.Scanner;

public class ArrayIndexOutBoundsException {

	
	public static void main(String[] args) {
		
		int [] random = new int[100];
		
		for (int i = 0; i < random.length; i++) {
			
			random[i] = (int)(Math.random() * 100);
			
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a index to show it`s value:");
		
		int index = scan.nextInt();
		scan.close();
		try {
			System.out.println("value of index " + index + " is:" + random[index]);
			
		} catch (IndexOutOfBoundsException e) {

			System.err.println("Out of Bounds");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
