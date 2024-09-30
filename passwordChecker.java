import java.util.*;
public class passwordChecker{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Password");
	String pass = sc.nextLine();

	
	
	int qualification = 10;
	boolean hasDigit = false;
	
	
	if(pass.length() >= qualification){
		if(pass.char() = "A-Z, a-z, 0-9"){
			System.out.println("Valid Password");
		}
	}
	else{
		System.out.println("Invalid Pass!!!");
	}
	
	
	
	
	}




}