public class MyAccountTester{
	public static void main(String [] args){
		MyAccount account = new MyAccount();
		MyAccount account2 = new MyAccount();
		account.setName("Eniola");
		System.out.println("Your Name Is: "+ account.getName());
		System.out.println("Balance Is: "+ account.getBalance());
		account.setDeposit(10000);
		System.out.println("Your Name Is: "+ account.getName());
		System.out.println("Balance Is: "+ account.getBalance());
		
		account.withdraw(5000);
		System.out.println("Your Name Is: "+ account.getName());
		System.out.println("Balance Is: "+ account.getBalance());

		
		account2.setName("Rick");
		System.out.println("Your Name Is: "+ account2.getName());
		account2.setDeposit(25000);
		System.out.println("Balance Is: "+ account2.getBalance());


	} 
}