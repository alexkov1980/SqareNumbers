package ru.netology.sqr.SquareRoot2.services;

public class SQRService {
    public int squareNumber(int lowRange, int highRange) {
        int summ = 0;
        for (int i = 1; i * i <= highRange; i++) {
            if (i * i >= lowRange) {
                summ++;
            }
        }
        return summ;
    }
}