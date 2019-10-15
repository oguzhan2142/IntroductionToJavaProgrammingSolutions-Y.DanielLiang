package Chapter10.exercise20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {

	public static void main(String[] args) {


		
		for (int i = 100; i <= 1000 ; i = i + 100) {

			
			System.out.println(computeE(i));
			
			
		}

	}

	public static BigDecimal computeE(int n) {

		BigDecimal sum = new BigDecimal("1");

		for (int i = 1; i <= n; i++) {

			BigDecimal one = new BigDecimal("1");
			BigDecimal divisor = computeFactorial(i);

			sum = sum.add(one.divide(divisor, 2 ,RoundingMode.HALF_UP));
		}

		return sum;
	}

	public static BigDecimal computeFactorial(int n) {

		BigDecimal sumOfFac = new BigDecimal("1");

		for (int i = 1; i < n; i++) {

			BigDecimal nextInteger = new BigDecimal(Integer.toString((i + 1)));
			sumOfFac = sumOfFac.multiply(nextInteger);

		}

		return sumOfFac;

	}

}
