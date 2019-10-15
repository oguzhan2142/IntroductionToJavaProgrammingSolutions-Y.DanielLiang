package Chapter11.exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Object> list = new ArrayList<Object>();

	public MyStack() {
	}
	
	  public boolean isEmpty() {
	    return list.isEmpty();
	  }

	  public int getSize() {
	    return list.size();
	  }

	  public Object peek() {
	    return list.get(0);
	  }

	  public Object pop() {
	    Object o = list.get(0);
	    list.remove(0);
	    return o;
	  }

	  public void push(Object o) {
	    list.add(0,o);
	  }

	  public int search(Object o) {
	    return list.lastIndexOf(o);
	  }

	  /** Override the toString in the Object class */
	  public String toString() {
	    return "stack: " + list.toString();
	  }
}
