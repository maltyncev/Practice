package s05.t02;

public class Multiplication extends Operation {
    Multiplication (int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    int calculate(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}
