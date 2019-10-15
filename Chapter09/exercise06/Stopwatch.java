package Chapter09.exercise06;

import java.util.Random;

public class Stopwatch {

	private long startTime;
	private long endTime;

	public Stopwatch() {

		startTime = System.currentTimeMillis();

	}

	public void start() {

		startTime = System.currentTimeMillis();

	}

	public void stop() {

		endTime = System.currentTimeMillis();

	}

	public long getElapsedTime() {

		return endTime - startTime;

	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public static void main(String[] args) {

		int[] randomNumbers = new int[100000];

		Random random = new Random();

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(100);
		}
		Stopwatch stopWatch = new Stopwatch();

		stopWatch.start();

		for (int i = 0; i < randomNumbers.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < randomNumbers.length; j++)
				if (randomNumbers[j] < randomNumbers[min_idx])
					min_idx = j;

			int temp = randomNumbers[min_idx];
			randomNumbers[min_idx] = randomNumbers[i];
			randomNumbers[i] = temp;

		}
		
		stopWatch.stop();
		
		System.out.println(stopWatch.getElapsedTime());
		

	}
}
