import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest{

	
	@Test
	public void testThatIHaveAccountAndBalanceIsZeroByDefault(){
		MyAccount account = new MyAccount();
		assertEquals(0, account.getBalance());
	}

	@Test
	public void testDeposit(){
		MyAccount account = new MyAccount();
		assertEquals(0, account.getBalance());
		account.setDeposit(5000);
		assertEquals(5000, account.getBalance());
	}
	
	@Test
	public void testThatIffNegativeAmountIsDepositedAmountRemainTheSame(){
		MyAccount account = new MyAccount();
		assertEquals(0, account.getBalance());
		account.setDeposit(-5000);
		assertEquals(0, account.getBalance());
	}
	
	
	@Test
	public void withdraw(){
	    MyAccount account = new MyAccount();
	    assertEquals(0, account.getBalance());
	    account.setDeposit(5000);
	    assertEquals(5000, account.getBalance());
	    account.withdraw(4000);
	    assertEquals(1000, account.getBalance());
	}

	@Test
	public void testWithdrawnAmountGreaterThanBalance(){
		MyAccount account = new MyAccount();
	    	assertEquals(0, account.getBalance());
	    	account.setDeposit(5000);
	    	assertEquals(5000, account.getBalance());
		account.withdraw(7000);
		assertEquals(5000, account.getBalance());
	}	
	
		
}