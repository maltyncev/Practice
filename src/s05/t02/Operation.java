package s05.t02;

public class Operation {
    protected int result;
    protected int previousResult;

    int returnResult(int leftOperand, int rightOperand) {
        previousResult = result;
        result = calculate(leftOperand, rightOperand);
        return result;
    }

    int calculate(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    int returnPrevious () {
        return previousResult;
    }
}