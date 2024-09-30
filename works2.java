import java.util.*;
public class works2{
	public static void main(String [] args){
		Scanner scammed = new Scanner(System.in);
		
		String stringChoose = """ 
			1. Level 1 Difficulty(One Number);
			2.Level 2 Difficulty(Two Or More Numbers);
		""";
		System.out.println(stringChoose);
		System.out.println("Enter  Number: ");
		int chosen = scammed.nextInt();

		switch(chosen){
			case 2:
			System.out.println("Level 2 Difficulty");
			System.out.println("Enter Two Digit Numbers:");
			int num1 = scammed.nextInt();
			System.out.println("Enter Two Digit Numbers:");
			int num2 = scammed.nextInt();
			
			int base1 = num1 * num2;
			System.out.println(base1 + " is the product ");
			break;

			case 1:
			System.out.println("Level 1 Difficulty");
			System.out.println("Enter One Digit Number:");
			int num3 = scammed.nextInt();
			System.out.println("Enter One Digit Number:");
			int num4 = scammed.nextInt();
			
			int base2 = num3 * num4;
			System.out.println(base2 + " is the product ");
			break;



		}
	}
}