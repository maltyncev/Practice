package s05.t02;

public class T02 {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();

        System.out.println(addition.calculate(1,2));
        System.out.println(multiplication.calculate(1,2));

        System.out.println(addition.calculate(3,4));
        System.out.println(addition.returnPrevious());
        System.out.println(multiplication.calculate(3,4));
        System.out.println(multiplication.returnPrevious());

        System.out.println(addition.calculate(5,6));
        System.out.println(addition.returnPrevious());
        System.out.println(multiplication.calculate(5,6));
        System.out.println(multiplication.returnPrevious());
    }
}