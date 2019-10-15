package Chapter12.exercise24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateLargeDataset {
	
	
	public static void main(String[] args) {
		
		
		File file = new File("src/Chapter12/exercise24/Salary.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try {
			PrintWriter write = new PrintWriter(file);
			
			for (int i = 1; i <= 1000; i++) {
				int randomNum = (int)(Math.random() * 3);
				write.println("FirstName" + i + " LastName" + i + " " + randomRank(randomNum) + " " +randomSalary(randomNum) );
			}
			
			write.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static String randomSalary(int randomNum) {
		int randomSalary;
		switch (randomNum) {
		case 0:
			randomSalary = (int) (Math.random() * 30) + 50;
			randomSalary *= 1000;
			return Integer.toString(randomSalary);
		case 1:
			randomSalary = (int) (Math.random() * 50) + 60;
			randomSalary *= 1000;
			return Integer.toString(randomSalary);
		case 2:
			randomSalary = (int) (Math.random() * 55) + 75;
			randomSalary *= 1000;
			return Integer.toString(randomSalary);
			

		default:
			return null;
		}
		
		
		
		
	}

	public static String randomRank(int randomNum) {
		
		
		switch (randomNum) {
		case 0:
			return "assistant";
		case 1:
			return "assosiate";
		case 2:
			return "full";

		default:
			return null;
		}
		
	}
}
