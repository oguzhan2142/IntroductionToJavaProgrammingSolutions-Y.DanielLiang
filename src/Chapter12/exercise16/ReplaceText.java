package Chapter12.exercise16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 3) {
			System.err.println("usage: java ReplaceText file oldString newString");
		}

		File file = new File(args[0]);

		if (!file.exists()) {
			System.err.println("File is not exist.");
			System.exit(0);
		}

		Scanner input = new Scanner(file);
		ArrayList<String> modified = new ArrayList<String>();

		while (input.hasNext()) {

			String str = input.nextLine().replaceAll(args[1], args[2]);
			modified.add(str);

		}
		input.close();

		PrintWriter output = new PrintWriter(file);

		for (int i = 0; i < modified.size(); i++) {

			output.println(modified.get(i));
		}
		output.close();
	}

}
