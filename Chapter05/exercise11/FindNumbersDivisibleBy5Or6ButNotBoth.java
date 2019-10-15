package Chapter05.exercise11;

public class FindNumbersDivisibleBy5Or6ButNotBoth {

	public static void main(String[] args) {

		for (int i = 100; i < 201; i++) {
			
			if ((i % 5 == 0 || i % 6 == 0 )&& i % 30 != 0) {
				System.out.println(i);
			}
			
		}
		
	}

}
