package Chapter05.exercise01;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbersAndComputeTheAverageOfNumbers {

	public static void main(String[] args) {

		
		int[] numbers = new int[100];
		int[] positiveNum = new int[100];
		int[] negativeNum = new int[100];
		boolean isLastMemberIsZero = false;
		
		Scanner scan = new Scanner(System.in);	

		int i = 0;
		while (!isLastMemberIsZero) {
			
			numbers[i] = scan.nextInt();
			
			if (numbers[i] == 0) {
				isLastMemberIsZero = true;
			}
			i++;
		}
		scan.close();
		
		int j = 0 , k = 0;
		int p = 0;
		
		int positiveNumbersTotal = 0;
		int negativeNumbersTotal = 0;
		
		while (numbers[p] != 0) {
			
			if (numbers[p] > 0 ) {
				positiveNum[j] = numbers[p];
				positiveNumbersTotal += positiveNum[j];
				j++;
			}
			else {
				negativeNum[k] = numbers[p];
				negativeNumbersTotal += negativeNum[k];
				k++;
			}
			
			p++;
		}
		
		
		
		p = 0;
		int positiveCounter = 0;
		while (positiveNum[p] != 0) {
			positiveCounter++;
			p++;
		}
		p = 0;
		int negativeCounter = 0;
		while (negativeNum[p] != 0) {
			negativeCounter++;
			p++;
		}
		
		System.out.println("The number of positives is " + positiveCounter);
		System.out.println("The number of negatives is " + negativeCounter);
		System.out.println("The total is " + (positiveNumbersTotal + negativeNumbersTotal));
		
		double average =(double) (positiveNumbersTotal + negativeNumbersTotal) /(positiveCounter + negativeCounter);
		System.out.println("The average is " + average);
		
		
	}

}
