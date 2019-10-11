package Chapter12.exercise32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RankingSummary {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		String[][] female = new String[5][5];
		String [][] male = new String[5][5];		
		String[] year = new String [5];
		
		for (int i = 0; i < year.length; i++) {
			year[i] = Integer.toString(2001 + i);
		}
		
		for (int i = 0; i < 5; i++) {
			File babyNames = new File("src/Chapter12/exercise32/babynames/babynames"+ year[i] + ".txt");
			Scanner input = new Scanner(babyNames);

			for (int j = 0; j < year.length; j++) {
				
			
			input.next();
			male[i][j] = input.next();
			input.next();
			female[i][j] = input.next();
			input.next();
			}
			input.close();
			
		}
		
		
		
		
		
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s" , "Year" , "Rank 1" , "Rank 2" ,"Rank 3" , "Rank 4" , "Rank5", "Rank 1" , "Rank 2" ,"Rank 3" , "Rank 4" , "Rank 5");
		System.out.println("\n-----------------------------------------------------------------------------------------------------");
		
		
		
		for (int i = 0; i < 5; i++) {
				
		System.out.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s" ,year[i] , female[i][0] , female[i][1], female[i][2], female[i][3], female[i][4] , male[i][0], male[i][1], male[i][2], male[i][3], male[i][4]);
		System.out.println();
		
		}
		
		
		
	}

}
