import java.util.*;
public class addition{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int numberEntered = sc.nextInt();
		for(int i = 1; i<=numberEntered; i++){
			for(int j =1; j<i; j++){
				System.out.print(j);
			}

			System.out.println(i);
	}


}
}