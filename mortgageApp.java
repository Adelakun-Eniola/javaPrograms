import java.util.*;
public class mortgageApp{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Amount You Want To Borrow:");
		double amountBorrowed = input.nextDouble();
		System.out.println("Enter The Amount Your Annual Interest Rate:");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter The Duration :");
		double durationRate = input.nextDouble();
		
		int percentage = 100;
		numberOfMonthsInAYear = 12;
		
		monthlyInterestRate = annualInterestRate / (percentage * numberOfMonthsInAYear);
		
		int numberOfMonths = durationRate * numberOfMonthsInAYear;
	
		numerator =Math.pow( monthlyInterestRate * (1 + monthlyInterestRate) , numberOfMonths);
		denominator = (1 + monthlyInterestRate)  numberOfMonths -1;
		
		print("Your Monthly PAyment Rate Is: $", totalMonthlyRate);
	}


}