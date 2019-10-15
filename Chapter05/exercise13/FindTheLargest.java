package Chapter05.exercise13;

public class FindTheLargest {

	public static void main(String[] args) {

		int n = 1;

		while (n * n * n < 12000) {
			n++;
		}
		
		if (n * n * n > 12000) {
			n--;
		}

		System.out.println(n + "  " + n * n * n);

	}

}
