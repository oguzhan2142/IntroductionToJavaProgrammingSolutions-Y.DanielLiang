package Chapter13.exercise12;

import Chapter13.exercise01.GeometricObject;

public class SumTheAreasOfGeometricObjects {

	public static double sumOfArea(GeometricObject[] list) {

		double sum = 0;
		for (int i = 0; i < list.length; i++) {

			sum += list[i].getArea();

		}

		return sum;

	}

}
