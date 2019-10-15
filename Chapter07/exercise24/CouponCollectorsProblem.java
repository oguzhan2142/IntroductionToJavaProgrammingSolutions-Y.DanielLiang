package Chapter07.exercise24;

public class CouponCollectorsProblem {

	public static void main(String[] args) {
		game();
	}

	public static void game() {

		int numberOfPick = 0;
		String [] pickedCardCategory = new String[4];
		String [] pickedCardNumber = new String[4];
		int i = 0;
		while (i<4) {

			String cardNumber = getRandomCardNumber();
			String cardCategory = getRandomCardCategory();
			
			if (!isCardCategoryPickedBefore(pickedCardCategory, cardCategory)) {
				pickedCardCategory[i] = cardCategory;
				pickedCardNumber[i] = cardNumber;
				i++;
			}
			
			
			numberOfPick++;
		}
		displayPickedCards(pickedCardNumber, pickedCardCategory);
		System.out.println("Number of picks: " + numberOfPick);
	}
	
	public static void displayPickedCards(String[] pickedCardNumber , String[] pickedCardCategory) {
		
		for (int i = 0; i < pickedCardCategory.length; i++) {
			
			System.out.println(pickedCardNumber[i] + " of " + pickedCardCategory[i]);
			
		}
		
		
		
	}


		
	public static boolean isCardCategoryPickedBefore(String[] categoryArray , String cardCategory) {
		
		for (int i = 0; i < categoryArray.length; i++) {
			if (categoryArray[i] == cardCategory) {
				return true;
			}
		}
		
		
		
		
		return false;
	}

	public static String getRandomCardCategory() {

		int generateCardCategory = (int) (Math.random() * 4) + 1;

		String cardCategory = null;

		switch (generateCardCategory) {
		case 1:
			cardCategory = "Spades";
			break;
		case 2:
			cardCategory = "Clubs";
			break;
		case 3:
			cardCategory = "Hearts";
			break;
		case 4:
			cardCategory = "Diamonds";
			break;
		default:
			break;
		}
		return cardCategory;
	}

	public static String getRandomCardNumber() {

		int generateCardNumber = (int) (Math.random() * 13) + 1;

		String cardNumber = null;

		switch (generateCardNumber) {
		case 1:
			cardNumber = "Ace";
			break;
		case 2:
			cardNumber = "2";
			break;
		case 3:
			cardNumber = "3";
			break;
		case 4:
			cardNumber = "4";
			break;
		case 5:
			cardNumber = "5";
			break;
		case 6:
			cardNumber = "6";
			break;
		case 7:
			cardNumber = "7";
			break;
		case 8:
			cardNumber = "8";
			break;
		case 9:
			cardNumber = "9";
			break;
		case 10:
			cardNumber = "10";
			break;
		case 11:
			cardNumber = "Jack";
			break;
		case 12:
			cardNumber = "Queen";
			break;
		case 13:
			cardNumber = "King";
			break;

		default:
			break;
		}

		return cardNumber;
	}

}
