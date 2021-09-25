package s05.t02;

public class Addition extends Operation {
    Addition (int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    int result;
    int preResult;

    @Override
    int calculate(int leftOperand, int rightOperand) {
        preResult = result;
        result = leftOperand + rightOperand;
        return result;
    }

    @Override
    int returnPrevious() {
        return preResult;
    }
}
