import java.util.*;
public class taxCalculator{
	public static void main(String [] args){
		Scanner first = new Scanner(System.in);
		double TAX_RATE = 0;
		double TOTAL_TAX = 0;

		int counter = 1;
		while(counter <= 3){
			System.out.println("Enter Your Name: ");
			String workerName = first.nextLine();

			System.out.println("Enter You Amount: ");
			int amountEarned = first.nextInt();
			first.nextLine();

			if (amountEarned > 0 && amountEarned <=30000){
				TAX_RATE = 15 / 100.0;
				TOTAL_TAX = amountEarned * TAX_RATE;
				System.out.println("Your Tax Is: $" + TOTAL_TAX);
			}
			else if (amountEarned > 30000){
				TAX_RATE = 20.0 / 100;
				TOTAL_TAX = amountEarned * TAX_RATE;
				System.out.println("Your Tax Is: $" + TOTAL_TAX);
			}
			

			counter =counter+1;
		}	
			
	
	}


}

































/*if (amountEarned > 0 && amountEarned <=30000){
				int tax = (TAX_BELOW/PERCENTAGE) * amountEarned;
				System.out.println("Your Tax Is: $" + tax);
			}
			else{
			int taxAbove = (TAX_ABOVE/PERCENTAGE) * amountEarned;
			System.out.println("Your Tax Is: $" + taxAbove);
			}*/
