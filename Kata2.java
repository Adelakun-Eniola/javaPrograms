import java.util.*;
public class Kata2{
	MathApp math = new MathApp();
	System.out.println("Enter A Number:");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	public static int factorOf(int number){
			int count  =1;
			int total = 0;
			for(count = 1; count <=number; count++) {
				if(number % count == 0) total++;
			}
			return total;
		}

}