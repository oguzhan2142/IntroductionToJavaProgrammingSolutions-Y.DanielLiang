package Chapter13.exercise08;

import java.util.ArrayList;

public class MyStack implements Cloneable {

	private ArrayList<Object> stack = new ArrayList<Object>();

	public boolean isEmpty() {
		return stack.isEmpty();

	}

	public int getSize() {
		return stack.size();
	}

	public Object peek() {

		return stack.get(stack.size() - 1);

	}

	public Object pop() {

		return stack.remove(stack.get(stack.size() - 1));

	}

	public void push(Object o) {

		stack.add(o);

	}

	public String toString() {

		return "stack " + stack.toString();
	}
	
	

	@Override
	public Object clone() throws CloneNotSupportedException {

		
		// deep copy
		ArrayList<Object> cloneList = new ArrayList<Object>();
		for (int i = 0; i < this.stack.size(); i++) {

			cloneList.add(this.stack.get(i));

		}

		MyStack cloneStack = new MyStack();
		cloneStack.stack = cloneList;

		return cloneStack;
	}
}
