package Chapter13.exercise08;

import Chapter13.exercise05.Circle;

public class Test {

	public static void main(String[] args) {
		
		
		MyStack stack1 = new MyStack();
		MyStack stack2 = new MyStack();

		
		for (int i = 0; i < 10; i++) {
			
			stack1.push(new Circle(i + 1));
			
		}
		
		
		try {
			stack2 = (MyStack) stack1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		System.out.println(stack1.equals(stack2));
		
		
		
	}
	
	
}
