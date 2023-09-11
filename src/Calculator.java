public class Calculator {
    private double operandOne;
    private String operation;
    private double operandTwo;
    private double result;

    public void setOperandOne(double operand) {
        this.operandOne = operand;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOperandTwo(double operand) {
        this.operandTwo = operand;
    }

    public void performOperation() {
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        } else {
            System.out.println("Invalid operation: " + operation);
        }
    }

    public double getResults() {
        return result;
    }
}