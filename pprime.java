import java.util.*;
public class pprime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Few Numbers and 0 to quit: ");
		int nyben = sc.nextInt();
		
		/*int low = 0;
		
		int highest = nyben.length()-1;
		
		boolean isPalindrome = true;
		
		while(low < highest){
			if (nyben.charAt(low) != nyben.charAt(highest)){
				isPalindrome = false;
				break;
			}
			low++;
			highest--;
					
		}
		if (isPalindrome){
			System.out.println("is Pal");
		}
		else{
			System.out.println("Is Not Pali o");
		}
			*/

		int positiveNum = 0;
		int negativeNum = 0;
		int totalNum =0;
		
		while(nyben !=0){
			totalNum = totalNum + nyben;
			System.out.println("Enter Few Numbers and 0 to quit: ");
			nyben = sc.nextInt();
			
			negativeNum++;
			positiveNum++;

			

		}
		
		System.out.println("total "+ totalNum);
		
		if(positiveNum != 0){
			double average = totalNum/2;
			
			System.out.println("Average is "+ average);
		}

		
	}


}