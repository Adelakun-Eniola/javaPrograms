import java.util.*;
public class numberReversal{
	public static void main(String ... args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter A Number: ");
	int number = input.nextInt();
	reverse(number);
	isPalindrome(number);
	
	}

	public static void reverse(int number){
	
		
		int reverse = 0;
	
		while(number != 0){
			int remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number/10;
		}
		System.out.println(reverse);
	
		
	}
	
	public static boolean isPalindrome(int number){
		
		int newNumber = number;
		int reverse = 0;
	
		while(number != 0){
			int remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number/10;
		}
		System.out.println(reverse);
	
		if(newNumber == reverse){
			System.out.println("is pal");
		}
		else{System.out.println("is not pal");}
		
		return true;
	}
		



}