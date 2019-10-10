package Chapter10.exercise25;

import java.util.ArrayList;

public class NewStringSplitMethod {

	public static void main(String[] args) {
		
		
		String [] str = split("abdik#das#der", "#");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		

	}

	public static String[] split(String s, String regex) {

		ArrayList<String> list = new ArrayList<String>();
		String[] returnArr;

		for (int i = 0; i < s.length(); i++) {

			String check = "";
			String addStr = "";

			for (int j = i; j < regex.length() + i; j++) {
				check += s.charAt(i);
			}
			int begin = i;
			int last = i + regex.length();

			if (check == regex) {
				for (int j = begin; j < last; j++) {
					addStr += s.charAt(j);
				}

				list.add(addStr);
			}

		}

		returnArr = new String[list.size()];
		for (int j = 0; j < returnArr.length; j++) {
			returnArr[j] = list.get(j);
		}

		return returnArr;
	}
}