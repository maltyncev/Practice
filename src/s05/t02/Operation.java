package s05.t02;

public class Operation {
    protected int result;
    protected int previousResult;

    int calculate (int leftOperand, int rightOperand) {
        previousResult = result;
        result = leftOperand - rightOperand;
        return result;
    }

    int returnPrevious () {
        return previousResult;
    }
}