package Chapter13.exercise09;

public class Test {

	public static void main(String[] args) {
		
		
		Circle c1 = new Circle(10, "white", true);
		Circle c2 = new Circle(10, "white", true);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.compareTo(c2));
		
		
		
	}
}
