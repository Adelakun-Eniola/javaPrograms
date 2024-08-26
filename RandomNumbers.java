import java.util.*;
public class RandomNumbers{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int numberAccepted = input .nextInt(); 
//int randomNumber = Math.random();

Random random = new Random();
int i = random.nextInt();
	System.out.println(i);

	}

}