package sortChallenges;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int numberOfAccounts = 0;
    private final List<Account> accounts = new ArrayList<>();

    public Account createAccount(String name, String password, String number) {
        Account account = new Account(name, password, number);
        accounts.add(account);
        numberOfAccounts++;
        return account;
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public void deposit(double amount,String accountNumber) {
        Account account = searchAccount(accountNumber);
        account.deposit(amount);
    }
    public double getBalance(String password, String accountNumber) {
        Account account = searchAccount(accountNumber);
        return account.getBalance(password);
    }
    public void withdraw(double amount,String accountNumber, String password) {
        Account account = searchAccount(accountNumber);
        account.withdraw(amount,password);
    }

    public Account searchAccount(String accountNumber) {
        for(Account account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new IllegalArgumentException("No such account");
    }

    public String generateAccountNumber(Account account) {
        return account.getAccountNumber();
    }
    public void transfer(String sender, String receiver, double amount, String password) {
        Account senderAccount = searchAccount(sender);
        Account receiverAccount = searchAccount(receiver);
        senderAccount.withdraw(amount, password);
        receiverAccount.deposit(amount);
    }
}
