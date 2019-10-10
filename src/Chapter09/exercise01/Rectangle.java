package Chapter09.exercise01;

public class Rectangle {

	double width;
	double height;

	public Rectangle() {

		width = 1;
		height = 1;

	}

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;

	}

	public double getArea() {

		return width * height;

	}

	public double getPerimeter() {

		return (width + height) * 2;

	}
	
	
	
	public static void main(String[] args) {
		
		
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5 , 35.9);
		
		System.out.println("rec1`s area " + rec1.getArea());
		System.out.println("rec1`s perimeter " + rec1.getPerimeter());
		System.out.println("rec2`s area " + rec2.getArea());
		System.out.println("rec2`s perimeter " + rec2.getPerimeter());
		
	}
	
	

}
