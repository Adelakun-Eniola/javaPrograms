import java.util.*;
public class works{
	public static void main(String [] args){
	Scanner scam = new Scanner(System.in);
	System.out.print("Enter First Number: ");
	int numberOne = scam.nextInt();
	
	System.out.print("Enter Second Number: ");
	int numberTwo = scam.nextInt();



	
	String operations = """ 
	The Following Help You To Perform Operations Successfully
	1. Addition
	2.Subtraction
	3. Multiplication
	""";
	System.out.println(operations);
	System.out.print("Choose A Number: ");
	int options = scam.nextInt();
	
		switch(options){
			case 1:
			System.out.println("Addition");
			int totalOne = numberOne + numberTwo;
			System.out.println(totalOne + " is the sum");
			break;
			
			case 2:
			System.out.println("Subtraction");
			int totalTwo = numberOne - numberTwo;
			System.out.println(totalTwo + " is the subtracted value");
			break;

			case 3:
			System.out.println("Multiplication");
			int totalThree = numberOne * numberTwo;
			System.out.println(totalThree + " is the multiplicated value");
			break;

		}


	}
}