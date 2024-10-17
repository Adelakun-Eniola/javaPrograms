import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class MyBankTest{

    @Test
    public void testThatDepositWorks(){
	
	
         //Given
	 double amountToDeposit = 350_000;
	 Account account = new Account();
	//When

	account.deposit(amountToDeposit);
	//Check
	
	double balance = account.getBalance();
	double expectedBalance = 350_000;
	assertEquals(expectedBalance, balance);
	



    }

    @Test
    public void testNegativeDepositAmountThrowsException(){
    
	//given
	double amountToDeposit = -100_000;
	Account account = new Account();
	//when
	//check
	assertThrows(IllegalArgumentException.class, () ->account.deposit(amountToDeposit));
	


    }

	@Test
	public void testCanTransferFund(){
	    
	    //given
	        double amountToDeposit = 20_000;
		Account sender = new Account();
		Account recipient = new Account();
		sender.deposit(amountToDeposit);
	    //when
		double transferAmount = 2_250;
		sender.transferFunds(transferAmount, recipient);
	    //check
		double recipientBalance = recipient.getBalance();
		assertEquals(transferAmount, recipientBalance);
	
	}

	
	
	@Test
	public void testThatSenderDebited(){
	    //given
		double amountDeposited = 20_000;
		Account sender = new Account();
		
		sender.deposit(amountDeposited); 
	    //when
		double debitAmount = 4_000;
		sender.debitFunds(debitAmount, sender);
		
	    //check
		double senderBalance = sender.getBalance();
		double expectedBalance = 16_000;
		
		assertEquals(expectedBalance, senderBalance);
	
	
	}

	@Test
	public void testThatInsufficientBalance(){
	    //given
		double amountInAccount = 5_000;
		Account sender = new Account();
	    //when
		double moreThan = 7_000;
		
	    //check
		assertThrows(IllegalArgumentException.class, () ->sender.deposit(amountInAccount));

	
	
	
	}
	@Test
	public void testThatArraysCanSwap(){
		//given
		int [] arrays= {1,2,3};
		//when
		int [] expected = {1,2,3};
		//check
		assertArrayEquals(arrays, expected);
	}



}
