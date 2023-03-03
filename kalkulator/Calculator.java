import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class Calculator {
    public double evaluateExpression(String expression) {
        ArrayList<String> tokens = new ArrayList<>(Arrays.asList(expression.split("\\s+")));
        ArrayList<String> operators = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
        Stack<Double> operands = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            if (operators.contains(token)) {
                while (!operatorStack.empty() && hasPrecedence(operatorStack.peek(), token)) {
                    applyOperation(operands, operatorStack.pop());
                }
                operatorStack.push(token);
            } else {
                operands.push(Double.parseDouble(token));
            }
        }
        while (!operatorStack.empty()) {
            applyOperation(operands, operatorStack.pop());
        }
        return operands.pop();
    }

    private boolean hasPrecedence(String operator1, String operator2) {
        if (operator1.equals("*") || operator1.equals("/") || operator1.equals("%")) {
            return true;
        } else if (operator2.equals("+") || operator2.equals("-")) {
            return true;
        }
        return false;
    }

    private void applyOperation(Stack<Double> operands, String operator) {
        double operand2 = operands.pop();
        double operand1 = operands.pop();
        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 % operand2;
                break;
        }
        operands.push(result);
    }
}
