import java.util.*;
public class Welcome{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("A Program To Convert NUmbers To Words");
		
		System.out.println("Please Enter A Number From 1-10:");
		int numEntered = scanner.nextInt();

		if(numEntered ==1){
			System.out.println("One");
		}
		else if(numEntered ==2){
			System.out.println("Two");
		}
		else if(numEntered ==3){
			System.out.println("Three");
		}
		else if(numEntered ==4){
			System.out.println("Four");
		}
		else if(numEntered ==5){
			System.out.println("Five");
		}

		else if(numEntered ==6){
			System.out.println("Six");
		}
		else if(numEntered ==7){
			System.out.println("Seven");
		}
		else if(numEntered ==8){
			System.out.println("Eight");
		}
		else if(numEntered ==9){
			System.out.println("Nine");
		}
		else if(numEntered ==10){
			System.out.println("Ten");
		}

	}
}