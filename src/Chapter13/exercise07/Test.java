package Chapter13.exercise07;

import Chapter13.exercise01.GeometricObject;

public class Test {
public static void main(String[] args) {
	
	
	
	
	GeometricObject [] object = new GeometricObject[5];
	
	for (int i = 0; i < 5; i++) {
		
		object[i] = new Square(3 + i);
		
	}
	
	for (int i = 0; i < object.length; i++) {
	System.out.print(object[i].getArea() + " "); 	object[i].howToColor();
	}
	
	
	
}
}
