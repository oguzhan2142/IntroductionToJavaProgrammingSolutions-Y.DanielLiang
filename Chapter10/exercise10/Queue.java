package Chapter10.exercise10;

public class Queue {

	int DEFAULT_CAPACITY = 8;
	int[] elements ;
	int size;
	
	public Queue() {
		
		elements = new int[DEFAULT_CAPACITY];
		
	}
	
	
	
	public void enqueue(int v) {
		
		if (size >= elements.length) {
			
			int[] temp = new int[elements.length * 2];
			
			System.arraycopy(elements, 0, temp, 0, size);
			
			elements = temp;
			
		}
		
		
		elements[size++] = v;
		
		
		
		
	}
	public void dequeue() {
		
		
		for (int i = 0; i < size; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		
	}
	
	public boolean empty() {
		
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	
	
	
	public int[] getElements() {
		return elements;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Queue queue = new Queue();
		
		
		
		for (int i = 0; i < 120; i++) {
			
			queue.enqueue(i);
		}
		
		for (int i = 0; i < 3; i++) {
			queue.dequeue();
			
		}
		
		for (int i = 0; i < queue.getSize() ; i++) {
			System.out.println(queue.getElements()[i]);
		}
		
		
	}


	
	
	
	
	
}
