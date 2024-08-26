import java.util.*;
public class MyApp{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();

		int numberSquare = number*number;

		if(number >= 100){
			System.out.println("The NUmber Is Greater Than 100");
		}
		else if(numberSquare >100){
			System.out.println("The NUmber Is Greater Than 100");
		}
		else if(numberSquare ==100){
		System.out.println("The Number is equal to 100");
		}

		else if(numberSquare != 100){
		System.out.println("The Number Is Less Than 100");
		}

		else{
		System.out.println("The Number Is Less Than 100");
		}
		
	}
}