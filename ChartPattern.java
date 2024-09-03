import java.util.*;
public class ChartPattern{
	public static void main(String [] Evans){
		Scanner user = new Scanner(System.in);
		System.out.println("Enter A Number From 1 - 10: ");
		int input = user.nextInt();
		int rows = input;
		for (int i = 1; i <=input; i++){
			for(int j = 1; j <=i; j++){
				System.out.print('*');
			}
		System.out.println( );
		}
	}

}