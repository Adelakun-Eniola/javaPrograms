import java.util.*;
public class Welcome4{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("A Program To Convert Feets To Meters:");
		System.out.println("Please Enter A Value For Feet:");
		
		int feetMeasure = scanner.nextInt();
		
		int totalCalc = feetMeasure*0.305;

		System.out.println("Your feet measure in meters is " + totalCalc "meters");
	}
}