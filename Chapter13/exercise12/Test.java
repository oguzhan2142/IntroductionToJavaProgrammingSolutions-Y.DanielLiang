package Chapter13.exercise12;

import Chapter13.exercise01.GeometricObject;
import Chapter13.exercise09.Circle;
import Chapter13.exercise10.Rectangle;

public class Test {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(10, "yellow", true);
		Circle c2 = new Circle(5, "black", false);
		Rectangle r1 = new Rectangle(4, 3, "purple", true);
		Rectangle r2 = new Rectangle(6 , 3, "orange", true);
		
		
		GeometricObject [] list = new GeometricObject [4];
		
		list[0] = c1;
		list[1] = c2;
		list[2] = r1;
		list[3] = r2;
		
		
		double sumOfObjects = SumTheAreasOfGeometricObjects.sumOfArea(list);
		System.out.println(sumOfObjects);
		
	}

}
