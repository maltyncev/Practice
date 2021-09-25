package s05.t02;

public class Multiplication extends Operation {
    Multiplication (int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    int result;
    int preResult;

    @Override
    int calculate(int leftOperand, int rightOperand) {
        preResult = result;
        result = leftOperand * rightOperand;
        return result;
    }

    @Override
    int returnPrevious() {
        return preResult;
    }
}
