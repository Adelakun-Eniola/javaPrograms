import java.util.Scanner;
public class timeConverter{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter time in milliseconds if you know the meaning of milliseconds:");
		long millitime = input.nextLong();
	
		System.out.println(convertMillis(millitime));
		
	}
	
	public static String convertMillis(long millis){
		//int hours: mins:seconds:hours
		long seconds = (millitime/1000) % 60;
		long minutes = (millitime/(1000 * 60)) %60;
		long hours = (millitime/(1000 * 3600)) % 60;
		
		long total = hours: minutes: seconds;

		return total;
	}

}