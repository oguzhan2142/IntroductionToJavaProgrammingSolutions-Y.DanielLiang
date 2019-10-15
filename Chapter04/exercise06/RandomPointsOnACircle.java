package Chapter04.exercise06;

public class RandomPointsOnACircle {

	public static void main(String[] args) {

		final double RADIUS = 40;

		double randomAngleADegree = (int) (Math.random() * 361);
		double randomAngleARadian = Math.toRadians(randomAngleADegree);

		double randomAngleBDegree = (int) (Math.random() * 361);
		double randomAngleBRadian = Math.toRadians(randomAngleBDegree);

		double randomAngleCDegree = (int) (Math.random() * 361);
		double randomAngleCRadian = Math.toRadians(randomAngleCDegree);

		
		//p1 point
		double x1 = RADIUS * Math.cos(randomAngleARadian);
		double y1 = RADIUS * Math.sin(randomAngleARadian);
		
		//p2 point
		double x2 = RADIUS * Math.cos(randomAngleBRadian);
		double y2 = RADIUS * Math.sin(randomAngleBRadian);
		
		//p3 point
		double x3 = RADIUS * Math.cos(randomAngleCRadian);
		double y3 = RADIUS * Math.sin(randomAngleCRadian);
		
		
		//calculate side lengths
		
		
		
		double side1 = Math.sqrt(Math.pow(x1 -x2, 2) + Math.pow(y1 -y2, 2));
		double side2 = Math.sqrt(Math.pow(x1 -x3, 2) + Math.pow(y1 -y3, 2));
		double side3 = Math.sqrt(Math.pow(x3 -x2, 2) + Math.pow(y3 -y2, 2));
		
		
		
		
		double p1Radian = Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2));              
		double p2Radian = Math.acos((Math.pow(side3, 2) + Math.pow(side2, 2) - Math.pow(side1, 2)) / (2 * side3 * side2));
		double p3Radian = Math.acos((Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2)) / (2 * side1 * side3));
		
		double p1Degree = Math.toDegrees(p1Radian);
		double p2Degree = Math.toDegrees(p2Radian);
		double p3Degree = Math.toDegrees(p3Radian);
		
		
		System.out.println("p1 degree is " + p1Degree);
		System.out.println("p2 degree is " + p2Degree);
		System.out.println("p3 degree is " + p3Degree);
		
		System.out.println("total degree of three points: " + (p1Degree + p2Degree + p3Degree)); 
		
		System.out.println();
		System.out.println("x1: " + x1);
		System.out.println("y1: " + y1);
		System.out.println("x2: " + x2);
		System.out.println("y2: " + y2);
		System.out.println("x3: " + x3);
		System.out.println("y3: " + y3);

	}

}
