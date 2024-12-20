public class MyAccount{
	private String name;
	private double balance;
	
	
	public void setName(String name){
	    this.name = name;
	}
	public String getName(){
	    return name;
	}

	public double getBalance (){
	    return balance;
	}
	public void setDeposit(int amount){
	    if(amount > 0){
	        this.balance  =balance +amount;
	    }
	}
	public void withdraw(int amount){
	    if(balance > amount){
	    	 this.balance = balance-amount;
	   }
	}
	public void withdrawal(int amount){
		if(amount < 0){
			this.balance = balance+amount;
		}
	}
	

}