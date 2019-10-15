package Chapter10.exercise04;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {

		x = 0;
		y = 0;

	}
	
	public MyPoint(double x , double y) {
		
		this.x = x;
		this.y = y;
		
		
		
		
	}

	public double distance(MyPoint p) {

		return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));

	}

	public double distance(double x, double y) {

		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

	}
	
	
	

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	public static void main(String[] args) {
		
		
		
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		
		
		System.out.println(point1.distance(point2));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
