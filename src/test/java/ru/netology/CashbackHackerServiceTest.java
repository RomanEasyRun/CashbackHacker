package ru.netology;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test

    public void amount1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test

    public void amountMoreThen1000() {
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test

    public void amountLessThen1000() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }
}