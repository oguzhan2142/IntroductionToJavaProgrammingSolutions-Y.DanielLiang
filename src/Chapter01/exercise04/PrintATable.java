package Chapter01.exercise04;

public class PrintATable {

	
	
	
	public static void main(String[] args) {
		
		
		System.out.print("a ");
		System.out.print("a^2 ");
		System.out.println("a^3");
		for (int i = 1; i < 5; i++) {
			System.out.print(i + "  ");
			System.out.print(i * i + "  ");
			System.out.println(i*i*i);
		}
		
	}
}
