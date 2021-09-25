package s05.t02;

public class Operation {
    private int leftOperand;
    private int rightOperand;


    public Operation (int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    int calculate(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    int returnPrevious() {
        return 0;
    }
}
