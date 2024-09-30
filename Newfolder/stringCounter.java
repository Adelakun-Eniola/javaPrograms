import java.util.*;
public class stringCounter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println(countLetters(name));
	
	}
	
	public static int countLetters(String s){
	
	
	int yourNameLength =  s.length();
	
	return yourNameLength;
	 
	}




}