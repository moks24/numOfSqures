package ru.nethology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldcalculate() {
        SQRService service = new SQRService();
        int lowerBounds = 200;
        int upperBound = 300;
        int expected = 3;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateExpectedResultIsGreater() {
        SQRService service = new SQRService();
        int lowerBounds = 200;
        int upperBound = 300;
        int expected = 3;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateLowerBorderMore() {
        SQRService service = new SQRService();
        int lowerBounds = 250;
        int upperBound = 300;
        int expected = 2;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateSmallBorders() {
        SQRService service = new SQRService();
        int lowerBounds = 250;
        int upperBound = 251;
        int expected = 0;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculatenumberborder99() {
        SQRService service = new SQRService();
        int lowerBounds = 100;
        int upperBound = 10000;
        int expected = 90;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }
}