package LoanApp;

public class Loan {
    private int depositAmount;
    private int balance;
    public Loan(){
        this.depositAmount = depositAmount;
    }


    public int deposit(int deposited) {
        return balance+=deposited;
    }

    public int getBalance() {
        return balance;
    }


    public void withdraw(int withdrawal) {
        balance-=withdrawal;
    }

    public void depositMonthly(int monthlyContribution) {
        balance+=monthlyContribution;
    }
}
