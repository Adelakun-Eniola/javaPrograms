import java.util.*;
public class Calculator2{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("A program to calculate Your BMI");

		System.out.println("Enter Weight IN Pounds:");
		double weight = scanner.nextDouble();
		
		System.out.println("Enter height IN Inches:");
		double height = scanner.nextDouble();

		double newWeight = weight*703;
		double newHeight = height*height;

		double bmiMAssIndex = newWeight/newHeight;

		System.out.println("Your Body Mass Index Is " + bmiMAssIndex);
	}


}