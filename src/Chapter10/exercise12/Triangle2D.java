package Chapter10.exercise12;

import Chapter10.exercise04.MyPoint;

public class Triangle2D {

	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D() {

		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);

	}

	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {

		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);

	}

	public double getArea() {

		double side1 = Math.pow(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2), 0.5);
		double side2 = Math.pow(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2), 0.5);
		double side3 = Math.pow(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2), 0.5);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		return area;

	}

	public double getPerimeter() {
		double side1 = Math.pow(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2), 0.5);
		double side2 = Math.pow(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2), 0.5);
		double side3 = Math.pow(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2), 0.5);

		return side1 + side2 + side3;
	}
	
	
	
	public boolean contains(Triangle2D t ) {
		
		
		
		if (t.p1.getX() < p1.getX() && t.p1.getY() < p1.getY() && t.p2.getX() < p2.getX() && t.p2.getY() < p2.getY()  && t.p3.getX() < p3.getX() && t.p3.getY() < p3.getY() && t.getArea() < this.getArea() ) {
		return true;	
		}
		
		return false;
		
	}
	
	
	
	
	public boolean contains(MyPoint p ) {
		
		/*
		 * double a = (y1 - y2); double b = -(x1 - x2); double c =(y3 - y4); double d =
		 * -(x3 - x4); double e = ((y1 - y2) * x1) - ((x1 - x2) * y1); double f = ((y3 -
		 * y4) * x3) - ((x3 - x4) * y3);
		 * 
		 * double x = (e * d - b * f) / (a * d - b * c); double y = (a * f - e * c) / (a
		 * * d - b * c);
		 * 
		 * if ((a * d - b * c) == 0) { System.out.println("two lines are parallel"); }
		 * else { System.out.println("the intersecting point is at " + x + "," + y); }
		 * 
		 */		
		return false;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Triangle2D t1 = new Triangle2D(10, 10, -10, -10, -10, 10);
		Triangle2D t2 = new Triangle2D();
		
		System.out.println(t2.contains(t1));
		
		
	}

}
