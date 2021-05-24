package ru.netology;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test

    public void amount1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test

    public void amountMoreThen1000() {
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test

    public void amountLessThen1000() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
}