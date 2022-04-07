package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest2 {

    @Test
    void getName() {
        SavingsAccount sa2 = new SavingsAccount("Jamie", 2000);
        String actual = sa2.getName();
        String expected = "James";
        assertEquals(expected, actual);
    }
}