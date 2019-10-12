package Chapter13.exercise07;

import Chapter13.exercise01.GeometricObject;

public class Square extends GeometricObject implements Colorable {

	int side;

	public Square() {

		side = 1;

	}

	public Square(int side) {

		this.side = side;

	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public void howToColor() {
	
		System.out.println("Color all four sides.");
		
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
