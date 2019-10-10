package Chapter12.exercise10;

import java.util.ArrayList;

public class TestOutOfMemoryError {

	public static void main(String[] args) throws OutOfMemoryError{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			
			while (true) {
				list.add(10);
			}
			
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
		}
		
		
		
	}
}
