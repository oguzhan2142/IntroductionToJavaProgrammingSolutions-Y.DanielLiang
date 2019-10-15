package Chapter07.exercise12;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an array: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		
		System.out.println("Reversed array is "   );
		
		for (int i : reverse(array)) {
			System.out.print(i + " ");
		}
		
	}

	
	public static int[] reverse(int[] x) {
		
		int[] reverse = new int[x.length];
		
		for (int i = 0 , j = reverse.length - 1; i < reverse.length; i++ ,j--) {
			
			reverse[i] = x[j];
		}
		
		
		return reverse;
	}
}
