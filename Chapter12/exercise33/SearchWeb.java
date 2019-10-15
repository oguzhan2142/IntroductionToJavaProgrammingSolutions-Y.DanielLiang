package Chapter12.exercise33;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchWeb {

	public static void main(String[] args) {

		String word = "https://github.com/oguzhan2142";
		crawler(word);
		
	}
	
	public static void crawler(String startingURL) {
		
		
		ArrayList<String> listOfPendingURLs = new ArrayList<String>();
		ArrayList<String> listOfTransverseURLs = new ArrayList<String>();
		
		listOfPendingURLs.add(startingURL);
		
		while (!listOfPendingURLs.isEmpty() && listOfTransverseURLs.size() <= 100) {
			
			String urlString = listOfPendingURLs.remove(0);
			
			if (!listOfTransverseURLs.contains(urlString)) {
				listOfTransverseURLs.add(urlString);
				System.out.println("Craw " + urlString);
				
				for (String s : getSubURLs(urlString)) {
					if (!listOfTransverseURLs.contains(s)) {
						listOfPendingURLs.add(s);
					}
				}
			}
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	public static ArrayList<String> getSubURLs(String urlString){
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			
			int current = 0;
			
			while (input.hasNext()) {
				
				String line = input.nextLine();
				current = line.indexOf("http:" , current);
				while (current > 0) {
					int endIndex = line.indexOf("\"" , current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:" , endIndex);
					}else {
						current = -1;
					}
				}
				
				
				
				
			}
			
			
			
		} catch (Exception e) {

			System.out.println("Error " + e.getMessage());
		}
		
		
		return list;
		
	}
	
	
	
	
}
