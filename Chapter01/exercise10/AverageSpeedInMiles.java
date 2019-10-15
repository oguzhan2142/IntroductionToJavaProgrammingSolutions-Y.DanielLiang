package Chapter01.exercise10;

public class AverageSpeedInMiles {

	public static void main(String[] args) {

		
		int km = 14;
		
		double minutes = 45 ;
		double seconds = 30 ;
		
		double kmPerMile = 1.6;
		
		double miles = km / kmPerMile ;
		
		
		double hour = minutes / 60 + seconds / (60*60);
		
		double averageSpeed = miles / hour;
		
		System.out.println(averageSpeed);
	}

}


