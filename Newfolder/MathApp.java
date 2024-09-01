import java.util.*;
public class MathApp{
	public static void main(String [] args){
		mathApp();
	}
	public static void mathApp(){
		String menu = """ 
	1. Check If Number Is Even
	2. Check If Number Is A Prime Number
	3. Subtract Two Numbers
	4. Division
	5. Factor Of
	6. Square Of
	7. Palindrome Number
	8. Factorial Of
	9. Sqaure Of
	""";
	System.out.print(menu);
	Scanner input = new Scanner(System.in);
	System.out.println("Enter An Option:");
	int numberEntered = input.nextInt();

		switch (numberEntered){
		case 1: Kata2.isEven(numberEntered); break;
		/*case 2: isPrimeNumber(); break;
		case 3: subtract(); break;
		case 4: division(); break;
		case 5: factorOf(); break;
		case 6: squareOf(); break;
		case 7: isPalindrome(); break;
		case 8: factorialOf(); break;
		case 9: squareOf(); break;*/
		}

	}

}