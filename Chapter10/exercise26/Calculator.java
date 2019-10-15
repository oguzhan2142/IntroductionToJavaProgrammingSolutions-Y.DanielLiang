package Chapter10.exercise26;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String question = scan.nextLine();
		scan.close();

		System.out.print(answer(question));

	}

	public static String answer(String question) {

		String firstOperand = "";
		String secondOperand = "";
		String operator = "";
		int lastIndex = 0;
		for (int i = 0; i < question.length(); i++) {

			if (question.charAt(i) >= '0' && question.charAt(i) <= '9') {

				firstOperand += question.charAt(i);

			}
			if (question.charAt(i) == '+' || question.charAt(i) == '-' || question.charAt(i) == '*'
					|| question.charAt(i) == '/') {

				operator += question.charAt(i);
				lastIndex = i;
				break;

			}

		}

		for (int i = lastIndex; i < question.length(); i++) {

			if (question.charAt(i) >= '0' && question.charAt(i) <= '9') {

				secondOperand += question.charAt(i);

			}

		}

		double operand1 = Double.parseDouble(firstOperand);
		double operand2 = Double.parseDouble(secondOperand);
		double result = 0;
		switch (operator) {

		case "+":
			result = operand1 + operand2;
			break;
		case "-":
			result = operand1 - operand2;
			break;
		case "/":
			result = operand1 / operand2;
			break;
		case "*":
			result = operand1 * operand2;
			break;
		}

		return Double.toString(result);

	}

}
