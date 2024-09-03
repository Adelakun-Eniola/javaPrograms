import java.util.*;
public class ChartPattern2{
	public static void main(String [] Evans){
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int number = scann.nextInt();
		int numberOne = number+1;
		int row= number;
		for(int i =number; i>=1; i--){
			for (int j =1; j<=i; j++){
				System.out.printf("number %d", numberOne);
			}
		System.out.println();
		}
	}

}