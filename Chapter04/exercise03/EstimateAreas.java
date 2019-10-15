package Chapter04.exercise03;

public class EstimateAreas {

	public static void main(String[] args) {
		final double RADIUS_OF_EARTH = 6371.01;
		
		double atlantaX = Math.toRadians(99);
		double atlantaY = Math.toRadians(40);
		
		double georgiaX = Math.toRadians(86);
		double georgiaY = Math.toRadians(31);
		
		double orlandoX =Math.toRadians(97) ;
		double orlandoY =Math.toRadians(35) ; 
		
		double floridaX =Math.toRadians(79) ;
		double floridaY = Math.toRadians(24);
		
		double savannahX =Math.toRadians(94) ;
		double savannahY = Math.toRadians(39);
		
		
		double charlotteX = Math.toRadians(98);
		double charlotteY = Math.toRadians(28);
		
		double norhCarolineX = Math.toRadians(75);
		double northCarolineY = Math.toRadians(33);
		
		
		double distanceAtlantaGeorgia = RADIUS_OF_EARTH * Math.acos(Math.sin(atlantaX) * Math.sin(georgiaX) + Math.cos(atlantaX) * Math.cos(georgiaX) * Math.cos(atlantaY - georgiaY));
		double distanceOrlandoFlorida = RADIUS_OF_EARTH * Math.acos(Math.sin(orlandoX) * Math.sin(floridaX) + Math.cos(orlandoX) * Math.cos(floridaX) * Math.cos(orlandoY - floridaY));
		double distanceSavannahGeorgia = RADIUS_OF_EARTH * Math.acos(Math.sin(savannahX) * Math.sin(georgiaX) + Math.cos(savannahX) * Math.cos(georgiaX) * Math.cos(savannahY - georgiaY));
		double distanceCharlotteNorthCaroline = RADIUS_OF_EARTH * Math.acos(Math.sin(charlotteX) * Math.sin(norhCarolineX) + Math.cos(charlotteX) * Math.cos(norhCarolineX) * Math.cos(charlotteY - northCarolineY));
		
		double s1 = (distanceAtlantaGeorgia + distanceOrlandoFlorida + distanceSavannahGeorgia) / 2;

		double area1 = Math.pow(s1 * (s1 - distanceAtlantaGeorgia) * (s1 - distanceOrlandoFlorida) * (s1 - distanceSavannahGeorgia), 0.5);
		
		double s2 = (distanceOrlandoFlorida + distanceSavannahGeorgia + distanceCharlotteNorthCaroline) / 2;

		double area2 = Math.pow(s2 * (s2 - distanceOrlandoFlorida) * (s2 - distanceSavannahGeorgia) * (s2 - distanceCharlotteNorthCaroline), 0.5);
		
		System.out.println(area1 + area2);
		
	}

}
