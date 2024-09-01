public class Kata{
		public static void main(String [] args){
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter An Option:");
			int numberEntered = input.nextInt();

				System.out.println(Kata.factorCollector(numberEntered));


		//factorCollector();
		}


		public static int factorCollector(int number){
			int count  =1;
			int total = 0;
			for(count = 1; count <=number; count++) {
				if(number % count == 0) total++;
			}
			return total;

	
}














