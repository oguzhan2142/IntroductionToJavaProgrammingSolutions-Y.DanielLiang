package Chapter07.exercise06;

public class RevisePrimeNumber {

	public static void main(String[] args) {

		int[] prime = new int[50];
		int arrayIndex = 2;
		prime[0] = 2;
		prime[1] = 3;
		int divided = 2;
		boolean isPrime = false;

		while (arrayIndex < 50) {
			isPrime = false;

			for (int divisor = 2; divisor <= Math.pow(divided, 0.5); divisor++) {

				if (divided % divisor == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}

			}

			if (isPrime) {
				prime[arrayIndex] = divided;
				arrayIndex++;
			}
			divided++;
		}

		for (int i = 0; i < prime.length; i++) {
			System.out.println(prime[i]);

		}

	}

}
// kok n e esit veya kucuk herhangi n i tam bolen sayi var mi
