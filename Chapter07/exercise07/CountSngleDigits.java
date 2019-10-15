package Chapter07.exercise07;

public class CountSngleDigits {

	public static void main(String[] args) {

		int[] count = new int[10];

		for (int i = 0; i < 100; i++) {

			int randomNum = (int) (Math.random() * 10);

			count[randomNum] += 1;

		}
		
		
		for (int i = 0; i < count.length; i++) {
			
			System.out.println(i + " is count " + count[i] + " times");
		}

	}

}
