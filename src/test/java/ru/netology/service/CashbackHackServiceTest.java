package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviseBuyIfAmountLessThousand1() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviseBuyIfAmountLessThousand2() {
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviseBuyIfAmountMoreThousand1() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviseBuyIfAmountMoreThousand2() {
        int amount = 8888;
        int actual = service.remain(amount);
        int expected = 112;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAdviseBuyIfSpentFullThousand1() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAdviseBuyIfSpentFullThousand2() {
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}