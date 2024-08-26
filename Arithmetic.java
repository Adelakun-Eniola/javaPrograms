import java.util.*;
public class Arithmetic{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int firstInteger = scanner.nextInt();


		System.out.println("Enter Integer Two:");
		int secondInteger = scanner.nextInt();

		System.out.println("Enter Integer Three:");
		int thirdInteger = scanner.nextInt();

		int sumTotal = firstInteger + secondInteger + thirdInteger;
		System.out.println("The Sum is " + sumTotal);

		int averageTotal = sumTotal/3;
		System.out.println("The average is " + averageTotal);

		int totalProduct = firstInteger * secondInteger * thirdInteger;
		System.out.println("The product Is " + totalProduct);


		if(firstInteger > secondInteger && firstInteger > thirdInteger){
			System.out.println(firstInteger  + "is The Highest NUmber");
		}
		else if(secondInteger > firstInteger && secondInteger > thirdInteger){
			System.out.println(secondInteger  + "Is The Highest Number");
		}

		else if(thirdInteger > firstInteger && thirdInteger > secondInteger){
			System.out.println(thirdInteger  + "Is The Highest Number");
		}

		

		if(firstInteger < secondInteger && firstInteger < thirdInteger){
			System.out.println(firstInteger   + "is The Smallest NUmber");
		}
		else if(secondInteger < firstInteger && secondInteger < thirdInteger){
			System.out.println(secondInteger  + "Is The Smallest Number");
		}

		else if(thirdInteger < firstInteger && thirdInteger < secondInteger){
			System.out.println(thirdInteger  + "Is The Smallest Number");
		}




	}



}