package Chapter11.exercise06;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayList {

	public static void main(String[] args) {

		
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		Loan loan = new Loan(10, 1, 300);
		Date date = new Date();
		String string = "this is string";
		Circle circle = new Circle(10);
		
		
		list.add(loan);
		list.add(date);
		list.add(string);
		list.add(circle);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		
	}

}
