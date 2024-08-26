import java.util.*;
public class Converter1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter A Number:");

		int num = input.nextInt();

		int originalNumber = num;

		int reverseNum=0;

		while(num!=0){
			reverseNum = reverseNum*10 + num%10;
			num = num/10;
		}

		if (originalNumber==reverseNum){
			System.out.println("NUmber Is Palindrome");
		} 

		else{
			System.out.println("NUmber IS NOT Palindrome");
		}
	}



} 