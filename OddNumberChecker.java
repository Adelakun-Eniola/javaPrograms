import java.util.*;
public class OddNumberChecker{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number Please:");
		int  numberEntered = input.nextInt();
		if(numberEntered % 2 == 0){
			System.out.println(numberEntered + " is even number ");
		}
		else{
			System.out.println(numberEntered + " is odd number");
		}
	}

}