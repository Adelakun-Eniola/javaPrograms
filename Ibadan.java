import java.util.*;
public class Ibadan{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pleae Enter A Number:");
		int figure = scanner.nextInt();

		System.out.println("Pleae Enter Another Number:");
		int figure2 = scanner.nextInt();

		int tripleMultiple = figure*figure*figure;

		int doubleMultiple = figure2*figure2;
			
		if(tripleMultiple % doubleMultiple ==0){
			System.out.println(tripleMultiple + "is a multiple of " + doubleMultiple);
		}

		else {
			System.out.println(tripleMultiple + "is not a multiple of " + doubleMultiple);
		}
	}


}