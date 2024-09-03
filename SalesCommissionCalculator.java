public class SalesCommissionCalculator{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter modafucking weekly sales:");
		double sales = scan.nextDouble();

		while(sales != -1){
			double salary = (0.09 * sales) + 200;
			System.out.printf("Your weekly earning is $%.2f%n", salary);
			System.out.printf("Enter First Person salary: ");
			sales = scan.nextDouble();
		}
	}




}