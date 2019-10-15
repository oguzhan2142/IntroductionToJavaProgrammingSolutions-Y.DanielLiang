package Chapter09.exercise09;

public class nSidedRegularPolygon {
	
	public static void main(String[] args) {
		
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("area of polygon1 is " + polygon1.getArea());
		System.out.println("perimeter of polygon1 is " + polygon1.getPerimeter());
		
		System.out.println("area of polygon2 is " + polygon2.getArea());
		System.out.println("perimeter of polygon2 is " + polygon2.getPerimeter());
		
		System.out.println("area of polygon3 is " + polygon3.getArea());
		System.out.println("perimeter of polygon3 is " + polygon3.getPerimeter());
		
	}

}

class RegularPolygon {

	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {

		n = 3;
		side = 1;
		x = 0;
		y = 0;

	}

	public RegularPolygon(int n, double side) {

		this.n = n;
		this.side = side;
		x = 0;
		y = 0;

	}

	public RegularPolygon(int n, double side, double x, double y) {

		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;

	}

	public double getPerimeter() {

		return side * n;

	}

	public double getArea() {

		return (n * side * side) / (4 * Math.tan(Math.PI / n));

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}