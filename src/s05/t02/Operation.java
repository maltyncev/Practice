package s05.t02;

public class Operation {
    protected int result;
    protected int previousResult;

    int calculate(int leftOperand, int rightOperand) {
        previousResult = result;
        result = doOperation(leftOperand, rightOperand);
        return result;
    }

    int doOperation(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    int returnPrevious () {
        return previousResult;
    }
}
