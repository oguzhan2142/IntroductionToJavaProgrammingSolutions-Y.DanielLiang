package Chapter10.exercise13;

import Chapter10.exercise04.MyPoint;

public class MyRectangle2D {

	
	private double x;
	private double y;
	private double width;
	private double height;
	
	
	
	public MyRectangle2D() {

		x = 0;
		y = 0;
		width = 1;
		height = 1;
	
	
	}
	
	
	public MyRectangle2D (double x , double y , double width , double height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public double getArea() {
		
		return width * height;
	}
	
	public double getPerimeter() {
		
		return (width + height) * 2;
		
	}
	
	public boolean contains(double x , double y) {
		
		if (x > this.x + width / 2 || x < this.x - width / 2) {
			return false;
		}	

		if (y > this.y + height / 2 || y < this.y - height / 2) {
			return false;
		}
		return true;
		
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
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	
	
	
	
	
	
}
