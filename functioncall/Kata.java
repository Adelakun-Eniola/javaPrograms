import java.util.*;
public class Kata{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int numberEntered = input.nextInt();
		
		System.out.println(factorCollector(numberEntered)+" is the number of factor");
		System.out.println(numberSquare(numberEntered) + " is the square ");
		System.out.println(numberDivisior(numberEntered));
	}
		
		public static int factorCollector(int number){
			int count  =1;
			int total = 0;
			for(count = 1; count <=number; count++) {
				if(number % count == 0) total++;
			}
			return total;
		}

		public static int numberSquare(int number){
			int square = number  *  number;
			return square;
		}


		public static boolean numberDivisior(int number){
			if (number %2 == 0){

				return true;
			}return false;
		}

		

}