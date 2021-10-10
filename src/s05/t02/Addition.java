package s05.t02;

public class Addition extends Operation {

    @Override
    int calculate(int leftOperand, int rightOperand) {
        previousResult = result;
        result = leftOperand + rightOperand;
        return result;
    }
}