package Chapter12.exercise05;

public class Test {

	
	public static void main(String[] args) {
		
		try {
			
			Triangle triangleWithException = new Triangle(1, 1, 3); 
			
			System.out.println(triangleWithException.getSide1());
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}
				
		
		
	}
}
