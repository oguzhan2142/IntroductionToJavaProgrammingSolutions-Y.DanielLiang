package Chapter03.exercise24;

public class PickACard {

	public static void main(String[] args) {

		int cardNum = (int) (Math.random() * 13) + 1;
		int cardCategory = (int) (Math.random() * 4) + 1;

		String cardCatName = null;

		switch (cardCategory) {
		case 1:
			cardCatName = "Clubs";
			break;
		case 2:
			cardCatName = "Diamond";
			break;
		case 3:
			cardCatName = "Hearts";
			break;
		case 4:
			cardCatName = "Spades";
			break;

		}
		switch (cardNum) {
		case 1:
			System.out.println("The card you picked is Ace of " + cardCatName);
			break;
		case 2:
			System.out.println("The card you picked is 2 of " + cardCatName);
			break;
		case 3:
			System.out.println("The card you picked is 3 of " + cardCatName);
			break;
		case 4:
			System.out.println("The card you picked is 4 of " + cardCatName);
			break;
		case 5:
			System.out.println("The card you picked is 5 of " + cardCatName);
			break;
		case 6:
			System.out.println("The card you picked is 6 of " + cardCatName);
			break;
		case 7:
			System.out.println("The card you picked is 7 of " + cardCatName);
			break;
		case 8:
			System.out.println("The card you picked is 8 of " + cardCatName);
			break;
		case 9:
			System.out.println("The card you picked is 9 of " + cardCatName);
			break;
		case 10:
			System.out.println("The card you picked is 10 of " + cardCatName);
			break;
		case 11:
			System.out.println("The card you picked is Jack of " + cardCatName);
			break;
		case 12:
			System.out.println("The card you picked is Queen of " + cardCatName);
			break;
		case 13:
			System.out.println("The card you picked is King of " + cardCatName);
			break;
		}
	}

}
