import java.util.*; 
public class crapGameModified{
	public static void main(String [] args){
	Scanner inputed = new Scanner(System.in);
	
	int bankBalance = 1000;
	System.out.println("Enter A Wager Dear Highly Esteemed Bettor: ");
	int wager = inputed.nextInt();
	int counter = 1;
	
	    while(wager > 1000){
		if(wager >= bankBalance){
			System.out.println("Enter Wager Again:");
			int newWaged = inputed.nextInt();

		}
				
	    }
	}




}