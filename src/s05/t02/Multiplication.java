package s05.t02;

public class Multiplication extends Operation {
    Multiplication (int leftOperand, int rightOperand) {
        super();
    }

    @Override
    protected int doOperation(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}
