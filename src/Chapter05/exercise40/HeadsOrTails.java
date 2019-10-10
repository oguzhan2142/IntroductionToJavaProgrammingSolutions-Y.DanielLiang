package Chapter05.exercise40;

public class HeadsOrTails {

	public static void main(String[] args) {

		int headsCounter = 0;
		int tailsCounter = 0;
		
		
		
		for (int i = 0; i < 1000000; i++) {
			
			int randomNum = (int)(Math.random() * 2) + 1;
			
			if (randomNum ==1) {
				
				headsCounter++;
				
			}
			else {
				tailsCounter++;
			}
			
			
		}
		
		System.out.println("Heads:" + headsCounter + "\nTails:" + tailsCounter);
		
	}

}
