package Chapter04.exercise12;

import java.util.Scanner;

public class HexToBinary {

	public static void main(String[] args) {

		System.out.println("Enter a hex digit: ");
		
		Scanner scan = new Scanner(System.in);
		
		char hexNum = scan.next().charAt(0);
		
		scan.close();
		
		
		if (hexNum >='0' && hexNum <= 'F') {
			
			int hexToDec = 0;
			
			if (hexNum >='0' && hexNum <= '9') {
				
				 hexToDec = (hexNum - '0') ;
			}
			else {
				hexToDec = hexNum - 'A' + 10 ;
			}
			
			
			int [] binaryNum = new int[20];
			int count = 0 ;
			while (count < 10) {
				
				if (hexToDec < 1) {
					break;
				}
				binaryNum[count] = hexToDec % 2 ;
				hexToDec = hexToDec / 2 ;
				count++;
				
			}
			
			for (int i = count -1 ; i >= 0; i--) {
				System.out.print(binaryNum[i]);
			}
			
			
		}
		else {
			System.out.println(hexNum + " is invalid input");
		}
		
		
	}

}
