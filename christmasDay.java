import java.util.*;
public class christmasDay{
	public static void main(String ... args){
	
	System.out.println("Your 12 Days Of Christmas Is Here");
	
	Scanner input = new Scanner(System.in);	
	System.out.print("Enter A Number From 1 - 12: ");
	int number = input.nextInt();
	
	switch (number){
		case 1:patridge();break;
		case 2:doves();break;
		case 3: hens();break;
		case 4: birds();break;
		case 5: rings();break;
		case 6: geese();break;
		case 7: swans();break;
		case 8: maids();break;
		case 9: ladies();break;
		case 10: lords();break;
		case 11: pipers();break;
		case 12:drummers();break;
	}
		
	}
	public static void patridge(){
		System.out.println("Patridge In A Pear Tree");
	
	}

	public static void doves(){
		System.out.println("2 Turtle Doves");
		patridge();
	}
	public static void hens(){
		System.out.println("3 French Hens");
		doves();
		
	}
	public static void birds(){
		System.out.println("4 Calling birds");
		hens();
	}
	public static void rings(){
		System.out.println("5 Golden Rings");
		birds();
	}
	public static void geese(){
		System.out.println("6 Geese A-laying");
		rings();
	}
	public static void swans(){
		System.out.println("7 Swans A-laying");
		geese();
	}
	public static void maids(){
		System.out.println("8 Maids A-laying");
		swans();
	}
	public static void ladies(){
		System.out.println("9 Ladies Dancing");
		maids();
	}
	public static void lords(){
		System.out.println("10 Lords A-leaping");
		ladies();
	}
	public static void pipers(){
		System.out.println("11 Pipers piping");
		lords();
	}
	public static void drummers(){
		System.out.println("12 Drummers Drumming");
		pipers();
	}

}