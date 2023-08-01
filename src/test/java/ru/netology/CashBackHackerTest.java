package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {
    CashBackHacker cash = new CashBackHacker();
    @Test
    public void ShouldCashTestMin() {
        int amount = 900;

        int actual = cash.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCashTestNormal() {
        int amount = 1000;

        int actual = cash.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCashTestMax() {
        int amount = 1100;

        int actual = cash.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }


}


