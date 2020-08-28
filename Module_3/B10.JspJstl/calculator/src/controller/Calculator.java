package controller;

public class Calculator {
    public static float calculate(float firstOperand, float secondOperand, char operator) {
        float result ;
        switch (operator) {
            case '+': {
                result = firstOperand + secondOperand;
                break;
            }
            case '-': {
                result = firstOperand - secondOperand;
                break;
            }
            case '*': {
                result = firstOperand * secondOperand;
                break;
            }
            case '/': {
                result = firstOperand / secondOperand;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
    }
}



