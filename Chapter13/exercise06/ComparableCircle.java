package Chapter13.exercise06;

import Chapter11.exercise06.Circle;

public class ComparableCircle extends Circle implements Comparable<Circle> {

	
	public ComparableCircle() {
		super();
	}

	public ComparableCircle(double newRadius) {
		super(newRadius);
	}

	@Override
	public int compareTo(Circle o) {

		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}

	}

}
