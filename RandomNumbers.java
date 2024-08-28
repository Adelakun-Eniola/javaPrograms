import java.io.*;
import java.util.*;

public class RandomNumbers {
	public static void main (String[] args) {
		Random rand = new Random();
		int randomNum = rand.nextInt();
		int max=10,min=1;
		System.out.println("Generated numbers are within "+min+" to "+max);
		int count = 1;
		int counter = 0;
		
			while(count =! counter ){
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter A Number:");
				if(numberEntered > randomNum){System.out.println("Too High");}
				else if (numberEntered < randomNum){System.out.println("Too Low Try Again");}
				else{System.out.println("You Passed");}
				count++;
			for(int count = 1; int count<=3; count++;){
				if (count %3 = 0){
					Random rand = new Random();
					int randomNum = rand.nextInt();
				}
			}
			}
			
			}
	}
}
