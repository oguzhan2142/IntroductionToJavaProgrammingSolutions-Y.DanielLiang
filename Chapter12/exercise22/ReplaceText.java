package Chapter12.exercise22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceText {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		


		if (args.length != 3) {
			System.err.println("usage: java ReplaceText dir oldString newString");
		}
		
		File file = new File(args[0]);

		
		File[] fileList = file.listFiles();
		
		
		
		for (int i = 0; i < fileList.length; i++) {
			

		Scanner input = new Scanner(fileList[i]);
		ArrayList<String> modified = new ArrayList<String>();

		while (input.hasNext()) {

			String str = input.nextLine().replaceAll(args[1], args[2]);
			modified.add(str);

		}
		input.close();

		PrintWriter output = new PrintWriter(fileList[i]);

		for (int j = 0; j < modified.size(); j++) {

			output.println(modified.get(j));
		}
		output.close();
	
		}
		
	}

}
