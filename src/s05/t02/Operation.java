package s05.t02;

public class Operation {
    private int leftOperand;
    private int rightOperand;
    private int previous;


    public Operation (int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    int calculate(int leftOperand, int rightOperand)
    {
        return leftOperand - rightOperand;
    }

    int calculate2 (int leftOperand, int rightOperand) {
        previous = calculate(leftOperand, rightOperand);
        return previous;
    }

    int returnPrevious()
    {
        return calculate2(leftOperand,rightOperand);
    }
}
