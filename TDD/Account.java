public class Account{

    private double balance;
    
        public void deposit(double amount){
	    if (amount < 0) 
	        throw new IllegalArgumentException("invalid");

	    balance+=amount;

        }


	public double getBalance(){
	
	    return balance;
	}



	public void transferFunds(double amount, Account recipient){
	    balance = balance - amount;
	    recipient.deposit(amount);
	}
	
	
	public double debitFunds(double amount, Account sender){
	    balance = balance - amount;
	   
		return balance;
	}



	public void insufficientAmount(double amount){
	    if (amount < 7_000) 
	        throw new IllegalArgumentException("invalid");

	    balance+=amount;

        }

}