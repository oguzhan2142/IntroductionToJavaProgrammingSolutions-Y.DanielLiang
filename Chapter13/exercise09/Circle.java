package Chapter13.exercise09;

import Chapter13.exercise01.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public boolean equals(Object c) {

		return getRadius() == ((Circle) c).getRadius();
			
	}

	@Override
	public int compareTo(Circle o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
