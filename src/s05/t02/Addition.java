package s05.t02;

public class Addition extends Operation {

    @Override
    int calculate(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }
}