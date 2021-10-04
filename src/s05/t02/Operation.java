package s05.t02;

public class Operation {
    private int leftOperand;
    private int rightOperand;
    private int previous;
    private int result;


    public Operation (int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    int calculate(int leftOperand, int rightOperand)
    {
        result = leftOperand - rightOperand;
        previous = result;
        return result;
    }

    int returnPrevious () {
        return previous;
    }
}
