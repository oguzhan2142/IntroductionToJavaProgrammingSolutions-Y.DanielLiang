package Chapter06.exercise37;

public class FormatAnInteger {

	public static void main(String[] args) {

		System.out.println(format(34, 1));
		
		
		
		
		
	}
	
	public static String format(int number, int width) {
		
		
		String numStr = Integer.toString(number);
		String str = "";
		
		if (str.length() >= width) {
			return (str + number);
		}
		
		for (int i = 0; i < width - numStr.length(); i++) {
			
			str += 0;
			
		}
		
		str += numStr;
		
		
		return str;
	}


}
