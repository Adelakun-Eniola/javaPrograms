package sortChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatAccountDepositWorks(){
        //Given
        int balance = 0;
        //When
        int deposit = 500;
        Account.deposit(deposit);
        //Check
        int newBalance = deposit+ balance;
        assertEquals(newBalance, Account.deposit(deposit));
    }


    @Test
    public void  testThatBalanceIsUpdated(){
        //Given
        Account acc = new Account();
        //When
        int amount  = -50;
        acc.testnegativeCantWithdraw(amount);
        //Check
        int result = 500;
        assertEquals(result, acc.testnegativeCantWithdraw(amount));

    }
    @Test
    public void thatwithdrawalWorks(){
        //Given
        Account acc = new Account();
        int funds = 500;
        //When
        acc.testICanWithdraw(funds);
        //check
        int balance = 200;
        assertEquals(balance, acc.testICanWithdraw(funds));
    }

    @Test
    public void testICannotWithdrawPassInitialAmount(){
        //Given
        Account acc = new Account();
        //when
        acc.testICannotWithdrawMoreThanDeposit();
        //check
        int returned = 500;
        assertEquals(returned, acc.testICannotWithdrawMoreThanDeposit());
    }
}
