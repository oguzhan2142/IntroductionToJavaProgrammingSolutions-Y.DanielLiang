package Chapter11.exercise10;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter five String:");
		
		String[] string = new String[5];
		
		for (int i = 0; i < string.length; i++) {
			string[i] = scan.next();
			myStack.push(string[i]);
		}
		scan.close();
		
		for (int i = 0; i < string.length; i++) {
			System.out.println(myStack.pop());
			
		}
		
	}

}
