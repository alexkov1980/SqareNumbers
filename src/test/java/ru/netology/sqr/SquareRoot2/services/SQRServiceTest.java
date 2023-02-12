package ru.netology.sqr.SquareRoot2.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    // @CsvSource ({
    //   "6,10,99",
    //   "7,9,99",
    //   "7,10,100"
    // })
    @CsvFileSource(files = "src/test/resources/square.csv")
    public void shoudCalculate(int expected, int lowRange, int highRange) {
        SQRService service = new SQRService();
        int actual = service.squareNumber(lowRange, highRange);
        Assertions.assertEquals(expected, actual);
    }
}
