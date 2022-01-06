package ru.nethology.sqr;

public class SQRService {
    public int calculate(int lowerBounds, int upperBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBounds && i * i <= upperBound) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
