package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {
    CashBackHacker cash = new CashBackHacker();

    @Test
    public void ShouldCashTestMin() {
        int amount = 900;

        int expected = 100;
        int actual = cash.remain(900);

        assertEquals(expected, actual);

    }

    @Test
    public void ShouldCashTestNormal() {
        int amount = 1000;

        int expected = 0;
        int actual = cash.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCashTestMax() {
        int amount = 1100;

        int expected = 900;
        int actual = cash.remain(1100);

        assertEquals(expected, actual);
    }

}


