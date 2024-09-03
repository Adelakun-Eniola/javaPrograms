import java.util.*;
public class Palindrome2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter A Number:");

		int num = input.nextInt(); 
		
		int numberOne = num /10000;
		int lastNumber = num % 10;
		int fourthNumber = num / 10;
		int finalFourthNumber = fourthNumber % 10;
		int thirdNumber = fourthNumber / 10;
		int finalThirdNumber = thirdNumber % 10;
		int secondNumber = thirdNumber / 10;
		int finalSecondNumber = secondNumber % 10;

		if(numberOne==lastNumber){
				System.out.print("It is a palindrome");
		}
		else{
			System.out.print("It is not a palindrome");

		}
	}
}