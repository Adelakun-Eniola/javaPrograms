package LoanApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class loanTest {
    Loan loans = new Loan();
    @Test
    public void testThatUserCanEnterInitialDeposit(){
        //given
        loans.deposit(10_000);
        int balance = loans.getBalance();
        //when
        int result = 10_000;
        assertEquals(result, balance);
    }

    @Test
    public void testThatuserCanWithdraw(){
        //given
        loans.deposit(10_000);
        //when
        loans.withdraw(3_000);
        int balance = loans.getBalance();
        //assert
        int result = 7_000;
        assertEquals(result,balance);
    }

    @Test
    public void testThatUserCanDepositMonthly(){
        //given
        loans.depositMonthly(5_000);
        //when
        int balance = loans.getBalance();
        //check
        int result = 12_000;
        assertEquals(result,balance);
    }

}

