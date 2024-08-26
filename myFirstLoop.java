import java.util.*;
public class myFirstLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any Number Greater Than 10:");
		int number = input.nextInt();
		int Sum = 0;

		int i = 1;
		while(i<=number){
			if(i%2 == 0){
			Sum = Sum+i;
			}
		i++;
			}
		

		System.out.println("The total sum is " +Sum+ "."  );
	}

}