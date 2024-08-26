import java.util.*;
public class ClassroomWork{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("A Program By Musah Jennifer Mercy");
	System.out.println("Please Enter A Number One:");
	int numberOne = scanner.nextInt();	

	System.out.println("Please Enter A Number Two:");
	int numberTwo = scanner.nextInt();

	if(numberOne > numberTwo){
		System.out.println(numberOne + " Is Greater Than " + numberTwo);
	}

	else if (numberTwo > numberOne){
		System.out.println(numberTwo + " Is Gsreater Than " + numberOne);
	}
	else if(numberOne == numberTwo){
		System.out.println(numberTwo + " Is Equal " + numberOne);
	} 

	}

}