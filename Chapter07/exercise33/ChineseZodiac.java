package Chapter07.exercise33;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {

		
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a year: ");
		 int year = scan.nextInt();
		 scan.close();
		 year %= 12;
		 
		 String[] animalName = new String[12]; 
		 animalName[0] = "monkey";
		 animalName[1] = "rooster";
		 animalName[2] = "dog";
		 animalName[3] = "pig";
		 animalName[4] = "rat";
		 animalName[5] = "ox";
		 animalName[6] = "tiger";
		 animalName[7] = "rabbit";
		 animalName[8] = "dragon";
		 animalName[9] = "snake";
		 animalName[10] = "horse";
		 animalName[11] = "ship";
		 
		System.out.println(animalName[year]);
		
	}

}
