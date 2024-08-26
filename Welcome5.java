import java.util.*;
public class Welcome5{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your Interest Per Month Calculator");
		System.out.println("Please Enter Your Balance:");
		double balance = scanner.nextDouble();
		
		System.out.println("Please Enter Your annualInterestRate:");
		double interestRate = scanner.nextDouble();

		double  interest = balance * (interestRate/1200);

		System.out.printf("Your interest per month is %.2f", interest);
	}
}