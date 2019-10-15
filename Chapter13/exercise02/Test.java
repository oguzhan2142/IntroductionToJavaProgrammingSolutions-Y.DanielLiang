package Chapter13.exercise02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<Number>();
		
		
		list.add(30);
		list.add(20.5 );
		list.add(new BigDecimal("12312452354234114124.20933523"));
		list.add(new BigInteger("1341904913242340234024324"));
		list.add(493493493404934L);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
		System.out.println();
		ShuffleArrayList.shuffle(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " +list.get(i));
		}
		
		
		
	}

}
