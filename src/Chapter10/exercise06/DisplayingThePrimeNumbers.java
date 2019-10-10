package Chapter10.exercise06;

import java.util.ArrayList;
import java.util.Scanner;

import Chapter10.exercise05.StackOfIntegers;

public class DisplayingThePrimeNumbers {
	
	
	public static void main(String[] args) {
		
		
		
		
		



		Scanner scan = new Scanner(System.in);

		System.out.println("enter a positive integer:");
		int lessThan = scan.nextInt();

		scan.close();

		StackOfIntegers stack = new StackOfIntegers();

		
		for (int number = 2; number < lessThan; number++) {
			
			
			boolean isPrime = true;
			
			
			for (int divisor = 2; divisor < number; divisor++) {
				
				
				if (number % divisor == 0) {
					isPrime = false;
				}
				
			}
			
			if (isPrime) {
				stack.push(number);
			}
			
			
		}


		
		ArrayList< Integer > list = new ArrayList<Integer>();
		
		while (stack.getSize() > 0 && stack.peek() != 0) {
			
			
			
			list.add(stack.pop()) ;
			
		}
		
		
		for (int j = list.size()- 1; j >= 0 ; j--) {
			System.out.print(list.get(j) + " ");
		}
		
		
		
		
		
		
	}
	
	

}
