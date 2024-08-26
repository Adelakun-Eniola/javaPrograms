import java.util.*;
public class Welcome3{
	public static void main(String [] args){
		System.out.println("Formula To Calculate Length of a runway");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The Speed Of The Airplane:");
		double speed = scanner.nextDouble();

		System.out.println("Please Eter The Acceleration:");
		double acc = scanner.nextDouble();

		double formulaLength = speed*speed/2*acc;

		System.out.printf("The length for the runway is %.2f m" , formulaLength);
		
	}



}