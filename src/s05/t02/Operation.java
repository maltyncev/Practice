package s05.t02;

public class Operation {
//    protected int leftOperand;
//    protected int rightOperand;
    protected int previousResult;

    public Operation () {}

    int calculate(int leftOperand, int rightOperand) {
        previousResult = doOperation(leftOperand, rightOperand);
        return previousResult;
    }

    protected int doOperation(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    int returnPrevious () {
        return previousResult;
    }
}
