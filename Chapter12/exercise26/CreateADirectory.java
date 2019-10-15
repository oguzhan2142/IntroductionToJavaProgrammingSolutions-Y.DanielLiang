package Chapter12.exercise26;

import java.io.File;
import java.util.Scanner;

public class CreateADirectory {
	public static void main(String[] args) {

		System.out.println("Enter directory name:");
		Scanner userChoice = new Scanner(System.in);

		String directoryName = userChoice.next();
		File dir = new File("src/Chapter12/exercise26/" + directoryName);
		userChoice.close();

		if (dir.exists()) {
			System.out.println("directory already exist");
		} else {

			dir.mkdir();

		}

	}

}
