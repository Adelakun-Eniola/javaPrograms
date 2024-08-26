import java.util.*;
public class PrimeNumberCalculator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int numberEntered = input.nextInt();
		
		int count  =1;
		int total = 0;
		for(count = 1; count <=numberEntered; count++) {
			if(numberEntered % count == 0) total++;
			}
			if(total++ <=2){
				System.out.println("numberEntered "  is a prime number);
			}
		//System.out.println(total);
		
		
		}
	}

