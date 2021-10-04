package s05.t02;

public class Operation {
    private int leftOperand;
    private int rightOperand;

    public Operation () {
//        this.leftOperand = leftOperand;
//        this.rightOperand = rightOperand;
    }

    int calculate(int leftOperand, int rightOperand)
    {
        return leftOperand - rightOperand;
    }

    int calculate2() {
        int result = calculate(leftOperand, rightOperand);
        int previous = result;
        return previous;
    }

    int returnPrevious () {
        return calculate2();
    }
}
