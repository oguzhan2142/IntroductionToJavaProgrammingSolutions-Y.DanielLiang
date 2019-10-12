package Chapter13.exercise10;

import Chapter13.exercise01.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	private double side1;
	private double side2;

	public Rectangle() {
		super();
	}

	public Rectangle(double side1, double side2, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;

	}

	@Override
	public boolean equals(Object r) {

		return getArea() == ((Rectangle) r).getArea();
	}

	@Override
	public int compareTo(Rectangle o) {

		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public double getPerimeter() {
		return (side1 + side2) * 2;
	}

	@Override
	public double getArea() {

		return side1 * side2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

}
