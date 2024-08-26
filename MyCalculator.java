import java.util.*;
public class MyCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int inputEntered = sc.nextInt();
		
		if (inputEntered %4 == 0){
			System.out.println( inputEntered + "  is divisible by 4");
		}
		else{
			System.out.println(inputEntered + " is not divisible by 4");
		}
	}

}