package Chapter09.exercise08;

public class Fan {

	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final  int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan() {

		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";

	}

	public String toString() {

		if (on) {
			return "fan speed:" + getSpeed() + " color:" + getColor() + " radius:" + getRadius();
		} else {
			return "fan is off" + " color:" + getColor() + " radius:" + getRadius();
		}

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {

		Fan fan = new Fan();

		fan.setSpeed(FAST);
		fan.setRadius(10);
		fan.setColor("yellow");
		fan.setOn(true);
		System.out.println(fan.toString());
		
		fan.setSpeed(MEDIUM);
		fan.setRadius(5);
		fan.setColor("blue");
		fan.setOn(false);
		System.out.println(fan.toString());
		
		
		

	}

}
