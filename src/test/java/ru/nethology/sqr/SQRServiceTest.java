package ru.nethology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculate() {
        SQRService service = new SQRService();
        int lowerBounds = 200;
        int upperBound = 300;
        int expected = 3;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void calculateExpectedResultIsGreater() {
        SQRService service = new SQRService();
        int lowerBounds = 200;
        int upperBound = 300;
        int expected = 5;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void calculateLowerBorderMore() {
        SQRService service = new SQRService();
        int lowerBounds = 250;
        int upperBound = 300;
        int expected = 3;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSmallBorders() {
        SQRService service = new SQRService();
        int lowerBounds = 250;
        int upperBound = 251;
        int expected = 3;
        int actual = service.calculate(lowerBounds, upperBound);
        assertEquals(expected, actual);
    }
}