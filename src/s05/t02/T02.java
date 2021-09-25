package s05.t02;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите левый операнд: ");
        int leftOperand = scanner.nextInt();
        System.out.println("Введите правый операнд: ");
        int rightOperand = scanner.nextInt();

        Addition addition = new Addition(leftOperand, rightOperand);
        Multiplication multiplication = new Multiplication(leftOperand, rightOperand);

        System.out.println(addition.calculate(leftOperand,rightOperand));
        System.out.println(addition.returnPrevious());
        System.out.println(multiplication.calculate(leftOperand,rightOperand));
        System.out.println(multiplication.returnPrevious());


        System.out.println("Введите левый операнд: ");
        leftOperand = scanner.nextInt();
        System.out.println("Введите правый операнд: ");
        rightOperand = scanner.nextInt();
        System.out.println(addition.calculate(leftOperand,rightOperand));
        System.out.println(addition.returnPrevious());
        System.out.println(multiplication.calculate(leftOperand,rightOperand));
        System.out.println(multiplication.returnPrevious());

    }
}
