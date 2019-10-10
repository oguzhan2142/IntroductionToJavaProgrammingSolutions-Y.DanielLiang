package Chapter10.exercise11;

public class Circle2D {

	private double x;
	private double y;
	private double radius;

	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getArea() {

		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean contains(double x, double y) {

		double distanceBetweenPoints = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

		if (distanceBetweenPoints < radius) {
			return true;
		}
		return false;

	}

	public boolean contains(Circle2D circle) {

		double distanceBetweenPoints = Math
				.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));

		if (distanceBetweenPoints < radius) {
			return true;
		}
		return false;

	}

	public boolean overlaps(Circle2D circle) {

		double distanceBetweenCenters = Math
				.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
		double totalRadius = this.radius + circle.getRadius();

		if (distanceBetweenCenters < totalRadius) {
			return true;
		}
		return false;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Circle2D circle1 = new Circle2D(2, 2, 2.5);
		
		
		System.out.println(circle1.getArea() + " " + circle1.getPerimeter() + " " );
		System.out.println(circle1.contains(3, 3));
		System.out.println(circle1.contains(new Circle2D(4,5,10.5)));
		System.out.println(circle1.overlaps(new Circle2D(3, 5, 2.3)));
		
		
		
		
		
		
	}

}
