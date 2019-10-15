package Chapter07.exercise16;

public class ExecutionTime {

	public static void main(String[] args) {

		int[] randomArray = randomlyGenerates();

		int randomKey = (int) (Math.random() * 100000);

		long startTime = System.currentTimeMillis();
		System.out.println(linearSearch(randomArray, randomKey));
		long endTime = System.currentTimeMillis();
		long executionTimeForLinear = endTime - startTime;

		startTime = System.currentTimeMillis();
		System.out.println(binarySearch(randomArray, randomKey));
		endTime = System.currentTimeMillis();
		long executionTimeForBinary = endTime - startTime;

		System.out.println("execution time for linear search " + executionTimeForLinear);
		System.out.println("execution time for binary search " + executionTimeForBinary);

	}

	public static int[] randomlyGenerates() {

		int[] random = new int[100000];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100000);
		}

		return random;
	}

	public static int linearSearch(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] == key) {
				return 1;
			}
		}
		return -1;

	}

	public static int binarySearch(int[] array, int key) {
		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {

					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}

			}
		}

		int low = 0;
		int high = array.length - 1;

		while (high >= low) {

			int mid = (low + high) / 2;

			if (key < array[mid]) {
				high = mid - 1;
			} else if (key == array[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}

		}
		return -low - 1;

	}
}
