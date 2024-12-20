package sortChallenges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testThatCreateAccountWorks(){
        Bank bank = new Bank();
        Account account = bank.createAccount("Victor","123","07084159495");
        int numberOfAccounts = bank.getNumberOfAccounts();
        assertEquals(1,numberOfAccounts);
    }
    @Test
    public void testThatDepositMoneyWorks(){
        Bank bank = new Bank();
        Account account = bank.createAccount("Victor","123","07084159495");
        String accountNumber = bank.generateAccountNumber(account);
        bank.deposit(1000,accountNumber);
        double balance = bank.getBalance("123",accountNumber);
        assertEquals(1000,balance);
    }
    @Test
    public void testThatWithdrawMoneyWorks(){
        Bank bank = new Bank();
        Account account = bank.createAccount("Victor","123","07084159495");
        String accountNumber = bank.generateAccountNumber(account);
        bank.deposit(1000,accountNumber);
        bank.withdraw(500,accountNumber,"123");
        double balance = bank.getBalance("123",accountNumber);
        assertEquals(500,balance);
    }
    @Test
    public void testThatTransferMoneyWorks(){
        Bank bank = new Bank();
        Account account = bank.createAccount("Victor","123","07084159495");
        String accountNumber = bank.generateAccountNumber(account);
        bank.deposit(10000,accountNumber);
        assertEquals(10_000,bank.getBalance("123",accountNumber));
        Account account2 = bank.createAccount("Victor","123","07084159495");
        String accountNumber2 = bank.generateAccountNumber(account2);
        assertEquals(10000,bank.getBalance("123",accountNumber));
        bank.transfer(accountNumber,accountNumber2,10_000,"123");
        assertEquals(10_000, bank.getBalance("123",accountNumber2));
        assertEquals(10_000,bank.getBalance("123",accountNumber));
    }


}
