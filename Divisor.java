import java.util.*;
public class Divisor{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int numberEntered = input.nextInt();
			if(numberEntered %4 == 0 && numberEntered %5 == 0){
				System.out.println( numberEntered +" is divisible by 4 and 5");
			}
			else if ( numberEntered %4== 0 || numberEntered %5 == 0){
				System.out.println(numberEntered + " is divisble by 4 or 5");
			}
			else {
				System.out.println(numberEntered + " is not divisible by 4 and 5");
			}
	} 

}