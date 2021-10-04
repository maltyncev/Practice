package s05.t02;

public class Addition extends Operation {
    Addition (int leftOperand, int rightOperand) {
        super();
    }

    @Override
    protected int doOperation(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }
}
