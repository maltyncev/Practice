package s05.t02;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();

        addition.calculate(1,2);
        multiplication.calculate(1,2);

        addition.calculate(3,4);
        addition.returnPrevious();
        multiplication.calculate(3,4);
        multiplication.returnPrevious();
    }
}