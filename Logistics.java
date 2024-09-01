import java.util.*;
public class Logistics{
	public static void main(String [] args){
	logistics();
	//System.out.println("Your Wage For The Day Is: #");
	}s
	
	public static void logistics(){
	int basepay = 5000;
	int amountPerPercel = 160;
	Scanner input = new Scanner(System.in);
	System.out.println("How Many Successful Delivery Was Made: ");
	int deliveryRate = input.nextInt();
	if (deliveryRate >= 70){
        	 amountPerPercel = 500;
		basepay = 5000;
        	int total_fee = (deliveryRate * amountPerPercel) +  basepay;
        	System.out.println("Your Wage For The Day Is: #" +total_fee);
	}
    	else if (deliveryRate >= 60 && deliveryRate <= 69){
        	amountPerPercel = 250;
        	int total_fee = (deliveryRate * amountPerPercel) +  basepay;
        	System.out.println(total_fee);
	}
    else if(deliveryRate >= 50 && deliveryRate < 59){
        	amountPerPercel = 200;
        	int total_fee = (deliveryRate * amountPerPercel) +  basepay;
        	System.out.println(total_fee);
	}
    else{
        amountPerPercel = 160;
        int total_fee = (deliveryRate * amountPerPercel) + basepay;
       System.out.println("Your Wage For The Day Is: #" +total_fee);
	}
	}
}