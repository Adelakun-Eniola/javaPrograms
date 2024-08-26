import java.util.*;
public class StudentScoreboard{
	public static void main(String [] args){
		Scanner strange = new Scanner(System.in);	
		System.out.println("Enter The Number of students:");
		int StudentNumber = strange.nextInt();
		int Number = 1;
		int Score = 1;
		while (Number <= StudentNumber && Score <=StudentNumber){
			System.out.println("Enter Students Name:");
			String StudentName = strange.next();
			System.out.println("Enter Student Score");
			int TheScores = strange.nextInt();
			 Number++;
			Score++;
		}
		if (Number == Math.max(Score)){
			System.out.println(Number);
		}
	}


}