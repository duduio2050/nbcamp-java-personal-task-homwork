package calculator.operator.impl;

import calculator.operator.Operation;

public class ModOperator implements Operation {
    @Override
    public int operate(int firstNum, int secondNum) {
        /* 구현 */
        return firstNum % secondNum;
    }
}
