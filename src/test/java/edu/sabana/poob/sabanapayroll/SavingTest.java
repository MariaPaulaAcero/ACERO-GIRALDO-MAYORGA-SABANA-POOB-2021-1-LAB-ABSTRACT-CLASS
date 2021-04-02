package edu.sabana.poob.sabanapayroll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SavingTest {


    @Test
    public void shouldGetDepositDiscount() {
        Savings account = new Savings();
        assertTrue(Double.compare(8000, account.getDepositDiscount()) == 0);
    }
    @Test
    public void shouldGetdepositMontlyInterest() {
        Savings account = new Savings();
        assertTrue(Double.compare(845.3333333332557, account.depositMontlyInterest())==0);
    }
    @Test

    public void shouldDepositAmount() {
        Savings account = new Savings();
        boolean result = account.deposit(10000);

        assertTrue(result);
        assertTrue(Double.compare(5000, account.getBalance()) == 0);
    }

    @Test
    public void shouldNotDepositAmount() {
        Savings account = new Savings();

        assertFalse(account.deposit(4000));
        assertFalse(account.deposit(5000));
        assertTrue(Double.compare(0, account.getBalance()) == 0);
    }
}
