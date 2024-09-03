import java.util.*;
public class milesCalculator{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	int miles = 0;
	int gallon = 0;
	int counter = 0;

		System.out.println("Enter miles or press 0 to quit: ");
		int milesEntered = input.nextInt();

		System.out.println("Enter gallon or press 0 to quit: ");
		int gallonsEntered= input.nextInt();

		while(count != 0){
			miles = miles + milesEntered;
			counter = counter+1;

			gallon = gallon + gallonsEntered;
			counter = counter + 1;

			System.out.println("Enter miles or press 0 to quit: ");
			int newMilesEntered = input.nextInt();

			System.out.println("Enter gallon or press 0 to quit: ");
			int newGallonsEntered= input.nextInt();

		}
		if (counter !=0){
		double perTrip = miles/gallon;
		System.out.println(perTrip);
		}
	
	}



}
