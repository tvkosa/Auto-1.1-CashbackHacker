package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviseBuyIfAmountLessThousand1() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdviseBuyIfAmountLessThousand2() {
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals (actual, expected);
    }

    @Test
    public void shouldAdviseBuyIfAmountMoreThousand1() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals (actual, expected);
    }

    @Test
    public void shouldAdviseBuyIfAmountMoreThousand2() {
        int amount = 7777;
        int actual = service.remain(amount);
        int expected = 223;
        assertEquals (actual, expected);
    }

    @Test
    public void shouldNotAdviseBuyIfSpentFullThousand1() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual, expected);
    }

    @Test
    public void shouldNotAdviseBuyIfSpentFullThousand2() {
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}