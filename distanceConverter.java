public class distanceConverter{
	public static void main(String [] args){
	
	mileToKilometer(25);
	kilometerToMile(40.2335);
	
	}
	
	public static double mileToKilometer(double mile){

	double kilometer = mile * 1.60934;
	System.out.println(kilometer);
	return 25;
	}
	
	public static double kilometerToMile(double kilometer){
	double miles = kilometer * 0.621371;
	System.out.println(miles);
	return 40.2335;
	}

}