package s05.t02;

public class Addition extends Operation {
    Addition (int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    int calculate(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }
}
