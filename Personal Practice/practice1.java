import java.util.Scanner;
public class practice1{
	public static void main(String [] args){
	     Scanner scan = new Scanner(System.in);



		/*for(int i = 1;  i <=5;  i++){
			System.out.printf("%d \t %d \t %d \t %d \n", i, i*i, i*i*i, i*i*i*i);
		}


	    


	     System.out.println("Account NUmber must not be greatre than 11...");
	     System.out.println("Eter Account Number:");
	     int accountNUmber = scan.nextInt();

	     System.out.println("Enter Balance At The Month Beginning:");
	     int balanceInitial = scan.nextInt();

	     System.out.println("Enter total of all items charged by customer this month:");
	     int itemCharged = scan.nextInt();

	     System.out.println("Enter Credit Applied to Customer:");
	     int creditCard = scan.nextInt();


	     System.out.println("Enter Credit Limit:");
	     int creditLimit = scan.nextInt();



	     int newBalance = (balanceInitial + itemCharged) - creditCard;
	     System.out.println(newBalance + " Is your new Balance");

	    if(newBalance > creditLimit){
	        System.out.println("Credit Limit Exceeded!!!");
	    }
	    else{
	        System.out.println("Credit Limit Not Exceeded!!!");
	    }





	    System.out.println("Enter The base of Triangle Bteween 1 - 10:");
	    int base = scan.nextInt();


	     for(int index = 1; index <= base; index++){
	
		for(int outdex = 1; outdex <= index; outdex++){
		    System.out.print(" * ");
		}
	     System.out.println();
	     }*/

		
	int total = 0;
	int counter = 0;
	System.out.println("ENter Student score or -1 to end:");
	int score = scan.nextInt();

	while (score != -1){
	    System.out.println("ENter Student score or -1 to end:");
	    score = scan.nextInt();
	    total +=score;
	    counter +=1;
	}
	if (score == -1){
	    int average = score/counter;
	    System.out.println("Average is " + average);
	    System.out.println(total);
	    System.out.println(score);
	}
	else{
	    System.out.println("OK");
	}













	



	    








	}

}