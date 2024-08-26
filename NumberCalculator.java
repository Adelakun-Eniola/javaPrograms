import java.util.*;
public class NumberCalculator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter A Second Number");
		int secondNumber = input.nextInt();

		int squaredNumber = firstNumber  ^ secondNumber;
		System.out.println(squaredNumber);
	}


}
