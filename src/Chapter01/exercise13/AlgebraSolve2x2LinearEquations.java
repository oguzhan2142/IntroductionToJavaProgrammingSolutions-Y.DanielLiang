package Chapter01.exercise13;

public class AlgebraSolve2x2LinearEquations {

	public static void main(String[] args) {

		// ax + by = e
		// cx + dy = f
		
		
		// x = (ed - bf) / (ad - bc) 
		// y = (af - ec) / (ad - bc)
		
		//equation1 = 3.4x + 50.2y = 44.5
		//equation2 = 2.1x + 55y = 5.9
		
		
		double x = (44.5 * 55 - 50.2 * 5.9) / (3.4 * 55 - 50.2 * 2.1); 
		double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 55 - 50.2 * 2.1);  
		
		System.out.println("X:" + x);
		System.out.println("Y:" + y);
	}

}
