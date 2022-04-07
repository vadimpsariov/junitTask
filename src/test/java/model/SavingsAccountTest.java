package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    @Test
    void calculateMonthlyInterest() {
        SavingsAccount sa1 = new SavingsAccount("Julian",2000);
        sa1.setAnnualInterestRate(0.04);

        double actual = sa1.calculateMonthlyInterest();
        double expected =2006.666666666666667;
        assertEquals(expected, actual);
    }
}