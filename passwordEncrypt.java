import java.util.*;
public class passwordEncrypt{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter four digit: ");
	int numberAccepted = sc.nextInt();


	int digitOne = (numberAccepted/10000)% 10;
	int digitTwo = (numberAccepted/1000)%10;
	int digitThree = (numberAccepted/100)%10;
	int digitFour = (numberAccepted/10)%10;


	int firstDigit = (digitOne + 7)%10;
	int secondDigit = (digitTwo + 7)% 10;
	int thirdDigit = (digitThree + 7)% 10;
	int fourthDigit = (digitFour + 7)% 10;

	int encryptedInteger = 
	}




}