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

        //When
        //Check

    }
}
