package Chapter09.exercise03;

import java.util.Date;

public class UseTheDateClass {

	public static void main(String[] args) {

		long elapsedTime = 10000;
		for (int i = 0; i < 8; i++) {

			Date date = new Date(elapsedTime);
			System.out.println(date.toString());
			elapsedTime *= 10;

		}

	}

}
