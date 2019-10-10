package Chapter12.exercise05;

import Chapter11.exercise01.GeometricObject;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {

		side1 = 1;
		side2 = 1;
		side3 = 1;

	}

	public Triangle (double side1, double side2, double side3) throws IllegalTriangleException{
		
		if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
			throw new IllegalTriangleException("Illegal length of sides");
		}
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {

		double s = (side1 + side2 + side3) / 2;

		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}
	public double getPerimeter() {
		
		return (this.side1 + this.side2 + this.side3);
		
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 ;
	}
	

}
