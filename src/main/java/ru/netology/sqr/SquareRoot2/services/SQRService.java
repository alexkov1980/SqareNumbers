package ru.netology.sqr.SquareRoot2.services;

public class SQRService {
    public int squareNumber(int lowRange, int highRange) {
        int summ = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowRange) {
                if (i * i <= highRange) {
                    summ++;
                }
            }
        }
        return summ;
    }
}