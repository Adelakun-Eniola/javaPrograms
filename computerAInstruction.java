import java.util.*;
import java.security.SecureRandom;
public class computerAInstruction{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	SecureRandom random = new SecureRandom();
	int numberOne = random.nextInt(10);	
	int numberTwo = random.nextInt(10);
	
	int multiplicationTotal= numberOne * numberTwo;
	
	System.out.println("How much Is " + numberOne +" times "  +numberTwo +" ?:");
	int userInput = input.nextInt();
	
	    if(multiplicationTotal == userInput){
	
	        System.out.println("Very Good, You're A Genius!!!");
	    }

	 

































	/*    public static int anotherMultiplication(int numOne, int numTwo){
	        while(userInput == multiplicationTotal){
		    System.out.println("How much Is " + numOne +" times "  			    +numTwo +" ?:");
		    int userInput2 = input.nextInt();
		    return userInput2;

		}
		 anotherMultiplication(numberOne, numberTwo);
	    System.out.println("Very Good");

	    
	    }*/
	}


}