package Chapter13.exercise05;

public class Test {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		
		Rectangle r1 = new Rectangle(10, 5);
		Rectangle r2 = new Rectangle(10, 5);
		
		System.out.println(GeometricObject.max(r1, r2));
		System.out.println();
		System.out.println(GeometricObject.max(c1, c2));
		
		
	}

}
