package Chapter06.exercise30;

public class Craps {

	public static void main(String[] args) {

		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;

		System.out.println("you rolled " + dice1 + "+" + dice2 + "=" + (dice1+dice2));
		
		if (isNatural(dice1, dice2)) {
			System.out.println("you win");
			System.exit(0);
		}
		if (isCraps(dice1, dice2)) {
			System.out.println("you lose");
			System.exit(0);

		}
		
		if (dice1 == dice2) {
			int point = dice1 + dice2;
			System.out.println("point is " + point);
			
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("you rolled " + dice1 + "+" + dice2 + "=" + (dice1+dice2));
			
			if (isSumEqualThePoint(dice1, dice2, point)) {
				System.out.println("you win");
			}else {
				System.out.println("you lose");
			}
			
		}
		
		
		
		
		else {
			if (dice1 + dice2 > 7) {
				System.out.println("you win");
			}else {
				System.out.println("you lose");
			}
			
		}
		
		
		
		
		

		
		
		

	}

	public static boolean isCraps(int dice1, int dice2) {

		if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
			System.out.println("craps");
			return true;
		}
		return false;

	}

	public static boolean isNatural(int dice1, int dice2) {

		if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {

			System.out.println("natural");
			return true;

		}

		return false;

	}

	public static boolean isSumEqualThePoint(int dice1, int dice2, int point) {

		return dice1 + dice2 == point;

	}
}
