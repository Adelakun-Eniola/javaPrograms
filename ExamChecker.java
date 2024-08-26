import java.util.*;
public class ExamChecker{
	public static void main(String [] args){
		Scanner userInput = new Scanner(System.in);
		int counter = 0;

		System.out.println("Enter Your Score:");
		int scoreEntered = userInput.nextInt();		
		while (scoreEntered != -1 ){
			counter = counter+1;


		if(scoreEntered >=60){
			System.out.println("You Passed");
		}
		else{
			System.out.println("You Failed");
		}
		

		System.out.println("Enter A Score:");
		scoreEntered = userInput.nextInt();
			
	}
}
}