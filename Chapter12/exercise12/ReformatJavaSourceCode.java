package Chapter12.exercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReformatJavaSourceCode {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 1) {
			System.err.println("usage : java ReformatJavaSourceCode -sourceCode");
			System.exit(0);
		}
		
		File source = new File(args[0]);

		Scanner input = new Scanner(source);
		ArrayList<String> modified = new ArrayList<String>();
		while (input.hasNext()) {

			String line = input.nextLine();

			if (line.isBlank() ) {
				continue;
			}
			modified.add(line);
			

		}
		input.close();
		
		PrintWriter output = new PrintWriter(source);
		
		for (int i = 0; i < modified.size() -1; i++) {
			
			
			
			if (isThereAnyParacentesis(modified.get(i + 1))) {
				output.println();
				output.print(modified.get(i));
			}else {
				output.println(modified.get(i));
				
			}
			
			if (i == modified.size() -2 ) {
				output.print(modified.get(i + 1));
			}
			
		}
		output.close();

	}
	
	public static boolean isFormattedAlready(String line) {
		
		if ((line.contains("public") || line.contains("private") || line.contains("class"))&& isThereAnyParacentesis(line)) {
			return true;
		}
		return false;
		
	}

	public static boolean isThereAnyParacentesis(String line) {

		
		
		for (int i = 0; i < line.length(); i++) {

			if (line.charAt(i) == '{') {
				return true;
			}

		}

		return false;
	}


}
