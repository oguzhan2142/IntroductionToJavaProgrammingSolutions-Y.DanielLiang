package Chapter12.exercise14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessScoresInATextFile {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("src/Chapter12/exercise14/scores.txt");

		Scanner input = new Scanner(file);

	
		ArrayList<String> list = new ArrayList<String>();
	
	
		
		while (input.hasNext()) {
			
			  list.add(input.next());
			
		}
		
		input.close();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		try {
			for (int i = 0; i < list.size(); i++) {
				
				number.add(Integer.parseInt(list.get(i)));
				
			}
			
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		double sum = 0;
		
		
		for (int i = 0; i < number.size(); i++) {

			sum += number.get(i);
		}
		
		double average = sum / number.size();
		
		System.out.println("sum in " + sum);
		System.out.println("average is " + average);
	
	
	}
	
	
	
	

}
