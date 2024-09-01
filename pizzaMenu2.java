import java.util.*;
public class pizzaMenu2{
	public static void main(String [] args){
		String yourPissaMenu = """ 
		1. Sapa Size  	||(4 Slices Per Pack) 		|| 2,000 per box
		2. Small Money	||(6 Slices)			|| 2,400 per box
		3. Big Boys   	||(8 Slices)         		|| 3,000 per box
		4. Odogwu	||12 Slices)          		|| 4,200 per box
	
		""";
		System.out.println(yourPissaMenu);
		int sapaSize = 4;
		int smallMoney = 6;
		int bigBoys = 8;
		int odogwu = 12;

		int sapaSizePrice = 2000;
		int smallMoneyPrice = 2400;
		int bigBoysPrice = 3000;
		int odogwuPrice = 4200;


		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Pizza Type: ");
		int pizzaType = sc.nextInt();
		System.out.println("How Many People You Wanna Order For: ");
		int peopleOrderedFor = sc.nextInt();
		int newSecondTotal=0;
		
		switch(pizzaType){
			case 4:
			System.out.println("You Chose Odogwu Size");
			//assumning they get one each
			int firstTotal = peopleOrderedFor %odogwu;
			int secondTotal = peopleOrderedFor /odogwu;
			
			if(firstTotal != 0 ){
				newSecondTotal=secondTotal+1;
				System.out.printf("The Number Of Box Bought Is: %s ",  newSecondTotal);
			}
			else{System.out.println(secondTotal + " Is The Number Of Box Bought " );}
			
			
			int remainingSlice =  (newSecondTotal * odogwu) - peopleOrderedFor;
			System.out.println(remainingSlice);
		}
	}
}
