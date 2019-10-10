package Chapter10.exercise05;

public class StackOfIntegers {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers() {

		size = DEFAULT_CAPACITY;
		elements = new int[size];
		
	}

	public StackOfIntegers(int capacity) {

		size = capacity;
		elements = new int[size];

	}

	public void push(int value) {

		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;

	}

	public int pop() {

		return elements[--size];
	}

	public int peek() {

		return elements[size - 1];
	}

	public boolean empty() {

		return size == 0;
	}

	public int getSize() {
		return size;
	}


}
