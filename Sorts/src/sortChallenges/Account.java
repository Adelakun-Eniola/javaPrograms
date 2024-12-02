package sortChallenges;

public class Account {
    int total = 500;
    public static int deposit(int amount) {
        return amount;
    }


    public int testnegativeCantWithdraw(int amount) {
        return 500;
    }

    public int testICanWithdraw(int funds) {
        int withdraw = 300;
        int balance = funds - withdraw;
        return balance;
    }

    public int testICannotWithdrawMoreThanDeposit() {
        int userWithdrawal = 600;
        if(userWithdrawal > total);
        return total;
    }
}
