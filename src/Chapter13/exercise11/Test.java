package Chapter13.exercise11;

public class Test {
	
	public static void main(String[] args) {
		
		Octagon o1 = new Octagon(10);
		
		Octagon o2;
		
		try {
			o2 = (Octagon) o1.clone();
			System.out.println(o1.compareTo(o2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
