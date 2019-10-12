package Chapter13.exercise11;

import Chapter13.exercise01.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon> , Cloneable {

	private double side;
	
	
	
	
	public Octagon() {
		super();
	}
	public Octagon (double side) {
		
		this.side = side;
		
	}
	
	public Octagon(double side , String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		
		return super.clone();
	}

	@Override
	public int compareTo(Octagon o) {

		if (side > o.getSide()) {
			return 1;
		}else if (side < o.getSide()) {
			return -1;
		}
		return 0;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2) * side * side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
	
	
	
	
	
	
	
	

}
