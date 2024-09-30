import java.util.Scanner;
public class numberOrder{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter A Number:");
	double numberOne = input.nextInt();
	
	System.out.println("Enter Second Number:");
	double numberTwo = input.nextInt();
	
	System.out.println("Enter Third Number:");
	double numberThree = input.nextInt();

	

	displaySortedNumbers(numberOne,  numberTwo , numberThree);
	
	}

	public static void displaySortedNumbers(double num1, double num2, double num3){
		double sumTotal = num1 + num2+ num3;

		double highest = num1;
		
		if (num2 > num1) highest = num2;
		if (num3 > highest) highest = num3;
		
		
		
		double smallest = num1;

		if (num2 < num1) smallest = num1;
		if (num3 < num1) smallest = num3;

		double mid = sumTotal - highest - smallest;
		
		System.out.printf("%.1f %.1f %.1f", highest, mid, smallest);
		
		
	}





}