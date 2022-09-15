package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class SQRServiceTest {
    @Test
    public void valueUpTo100() {
        SQRService service = new SQRService();

        int actual = service.calculate(0,100);
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void valueAboveZero() {
        SQRService service = new SQRService();

        int actual = service.calculate(200,300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void valueZero() {
        SQRService service = new SQRService();

        int actual = service.calculate(0,0);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void valueBelowZero() {
        SQRService service = new SQRService();

        int actual = service.calculate(-100,0);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
