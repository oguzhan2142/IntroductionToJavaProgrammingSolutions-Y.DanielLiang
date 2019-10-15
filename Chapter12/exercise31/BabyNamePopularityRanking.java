package Chapter12.exercise31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BabyNamePopularityRanking {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		System.out.println("Enter the gender:");
		char gender = scan.next().charAt(0);
		System.out.println("Enter the name:");
		String name = scan.next();
		scan.close();

		File babyNames = new File("src/Chapter12/exercise31/babynames/babynames" + year + ".txt");

		Scanner input = new Scanner(babyNames);
		String getName = "";
		String getRank = "";

		if (gender == 'M') {

			while (true) {
				if (getName.equals(name)) {
					break;
				}
				try {
					getRank = input.next();
					getName = input.next();
					for (int i = 0; i < 3; i++) {
						
						input.next();
					}
					
				} catch (NoSuchElementException e) {
					System.err.println(name +  " is not ranked in year " + year);
					System.exit(0);
				}
			}

		} else {
			while (true) {

				if (getName.equals(name)) {
					break;
				}

				try {
					getRank = input.next();
					for (int i = 0; i < 2; i++) {
						input.next();
					}
					
					getName = input.next();
					input.next();
					
				} catch (NoSuchElementException e) {
					System.err.println(name +  " is not ranked in year " + year);
					System.exit(1);
				}
			}
		}

		input.close();
		
		
		
		System.out.println(getName +  " is ranked #" + getRank + " in year " + year); 
		
		
		
		
	}

}
