package Chapter12.exercise15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteReadData {

	public static void main(String[] args) throws IOException {

		File file = new File("src/Chapter12/exercise15/Exercise12_15.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		PrintWriter output = new PrintWriter(file);

		for (int i = 0; i < 100; i++) {

			int random = (int) (Math.random() * 1000);
			output.print(random + " ");

		}
		output.close();

		Scanner input = new Scanner(file);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (input.hasNext()) {

			int temp = Integer.parseInt(input.next());
			list.add(temp);

		}
		input.close();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size() ; j++) {

				if (list.get(i) > list.get(j)) {

					int temp1 = list.get(i);
					int temp2 = list.get(j);

					list.set(i, temp2);
					list.set(j, temp1);

				}

			}

		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}

	}

}
