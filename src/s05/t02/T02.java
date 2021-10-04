package s05.t02;

public class T02 {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();

        addition.returnResult(1,2);
        multiplication.returnResult(1,2);

        addition.returnResult(3,4);
        addition.returnPrevious();
        multiplication.returnResult(3,4);
        multiplication.returnPrevious();
    }
}