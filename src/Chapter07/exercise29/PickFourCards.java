package Chapter07.exercise29;

public class PickFourCards {

	public static void main(String[] args) {

		int sum = 0;
		int numberOfPicks = 0;

		while (sum <= 24) {

			int cardNum = pickACardNumber();
			System.out.println(displayPickedCard(cardNum, pickACardCategory()));
			sum += cardNum;

			numberOfPicks++;
		}
		System.out.println("number of picks : " + numberOfPicks);

	}

	public static String pickACardCategory() {

		int randomNum = (int) (Math.random() * 4);

		if (randomNum == 0) {
			return "Spades";
		} else if (randomNum == 1) {
			return "Diamond";
		} else if (randomNum == 2) {
			return "Clubs";
		}

		else {
			return "Hearts";
		}

	}

	public static String displayPickedCard(int cardNum, String cardCategory) {

		if (cardNum == 1) {
			return "Ace " + cardCategory;
		} else if (cardNum == 11) {
			return "Jack " + cardCategory;
		} else if (cardNum == 12) {
			return "Quenn " + cardCategory;
		} else if (cardNum == 13) {
			return "King " + cardCategory;
		} else {
			return Integer.toString(cardNum) + " " + cardCategory;

		}

	}

	public static int pickACardNumber() {

		int randomNum = (int) (Math.random() * 13) + 1;

		return randomNum;
	}

}
