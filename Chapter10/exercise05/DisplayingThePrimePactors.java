package Chapter10.exercise05;

import java.util.Scanner;

public class DisplayingThePrimePactors {
public static void main(String[] args) {


	Scanner scan = new Scanner(System.in);

	System.out.println("enter a positive integer:");
	int number = scan.nextInt();

	scan.close();

	StackOfIntegers stack = new StackOfIntegers();

	int divisor = 2;
	while (number > 1) {

		if (number % divisor == 0) {
			number /= divisor;
			stack.push(divisor);
			continue;
		}
		divisor++;


	}
	
	
	while (stack.getSize() > 0 && stack.peek() != 0) {
		
		System.out.print(stack.pop() + " ");
	}
	


}
}
