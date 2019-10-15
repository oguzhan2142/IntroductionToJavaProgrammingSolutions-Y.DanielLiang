package Chapter12.exercise23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ProcesScoresInATextFileOnTheWeb {

	
	public static void main(String[] args) throws MalformedURLException {
		
			
			try {
				URL url = new URL("https://github.com/systemjs/plugin-text/blob/master/text.txt");
				Scanner input = new Scanner(url.openStream());
				
				while (input.hasNext()) {
					System.out.println(input.nextLine());
				}
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		
	}
	
	
	
	
	
	
	
}
