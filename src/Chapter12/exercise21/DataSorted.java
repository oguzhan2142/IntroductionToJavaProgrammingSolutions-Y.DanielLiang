package Chapter12.exercise21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSorted {

	public static void main(String[] args) throws IOException {

		File file = new File("src/Chapter12/exercise21/SortedStrings.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		Scanner input = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();

		while (input.hasNext()) {

			list.add(input.next());

		}

		input.close();
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(list.get(i));
		}

		if (isListSorted(list)) {
			System.out.println("list sorted");
		}else {
			System.out.print("list not sorted: ");
			int[] index = giveWords(list);
			System.out.println( list.get(index[0]) + ":" + list.get(index[1]));
			
		}
		

	}
	
	public static int[] giveWords(ArrayList<String> list) {
		
		int[] index = new int[2];
		
		for (int i = 0; i < list.size() - 1; i++) {
			
			if (list.get(i).charAt(0) > list.get(i + 1).charAt(0)) {
				index[0] = i;
				index[1] = i + 1;
				break;
			}
			
			
		}
		
		
		return index;
	}

	public static boolean isListSorted(ArrayList<String> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			char firstWord = list.get(i).charAt(0);
			char secondWord = list.get(i + 1).charAt(0);

			if (firstWord > secondWord) {
				return false;

			}
		}

		return true;

	}
}
