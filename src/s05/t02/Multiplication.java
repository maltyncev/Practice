package s05.t02;

public class Multiplication extends Operation {

    @Override
    int doOperation(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}