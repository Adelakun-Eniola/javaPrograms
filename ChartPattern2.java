import java.util.*;
public class ChartPattern2{
	public static void main(String [] Evans){
		/*Scanner scann = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int number = scann.nextInt();
		int numberOne = number+1;
		int row= number;
		for(int i =number; i>=1; i--){
			for (int j =1; j<=i; j++){
				System.out.printf("number %d", numberOne);
			}
		System.out.println();
		}*/







	int [] array = {4,5,8};
	int[] multipliedArray = new int [array.length*2];
	for(int index = 0; index < array.length; index++){
		multipliedArray[index] = array[index];
		multipliedArray[index+array.length] = array[index]*2;
	}
	System.out.println(Arrays.toString(multipliedArray));


	





























	}

}