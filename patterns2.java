import java.util.*;
public class patterns2{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int entered = sc.nextInt();
		patternFunction(entered);
	
	}
	public static int patternFunction(int entered){
		for (int i = 1; i <=entered; i++){
			for (int j =1; j<=i; j++){
			System.out.print(" * ");
			}
		System.out.println();
		}
		
		for (int i = 1; i<=entered; i++){
			for(int j = entered; j>=i; j--){
			System.out.print(" * ");
		}
		System.out.println();
	}

	return entered;
	}

}