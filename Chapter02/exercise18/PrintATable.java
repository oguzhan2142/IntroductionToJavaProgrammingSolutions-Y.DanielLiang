package Chapter02.exercise18;

public class PrintATable {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		System.out.print("a ");
		System.out.print("b ");
		System.out.println("pow(a,b)");
		
		for (int i = 1; i < 6; i++) {
			System.out.print(a + " ");
			System.out.print(b + " ");
			System.out.println((int)Math.pow(a, b));
			a++;
			b++;
			
		}
		
	}

}
