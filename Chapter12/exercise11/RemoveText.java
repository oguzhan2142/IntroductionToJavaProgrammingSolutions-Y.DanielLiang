package Chapter12.exercise11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {

	public static void main(String[] args) throws Exception {


		if (args.length != 2) {
			System.err.println("usage: java RemoveText -sourcefile romovedText");
			System.exit(0);
		}

		File file = new File(args[0]);
		String modified = "";

		try (Scanner input = new Scanner(file);) {

			while (input.hasNext()) {

				String s1 = input.nextLine();

				modified += s1.replaceAll(args[1], "");

			}

		}

		try (PrintWriter output = new PrintWriter(file);) {

			output.print(modified);
		}

	}

}
