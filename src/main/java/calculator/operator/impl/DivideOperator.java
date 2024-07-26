package calculator.operator.impl;

import calculator.operator.Operation;

public class DivideOperator implements Operation {

    @Override
    public int operate(int firstNum, int secondNum) {
        /* 구현 */
        return firstNum / secondNum;
    }
}
