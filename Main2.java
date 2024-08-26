import java.util.*;

public class Main2{
	public static void main(String [] args){
		System.out.println("A program to calculate your cost of driving");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Whole Number Between 0 and 1000");
		int number0 = scanner.nextInt();
		int sum=0;
			int number1 = number0%10;
			int number = number0/10;  
			sum = sum+ number1;

		 System.out.println("The Sum Of The Numbers Are " + sum);
	}


}