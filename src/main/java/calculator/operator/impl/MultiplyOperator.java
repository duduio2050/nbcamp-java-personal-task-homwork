package calculator.operator.impl;

import calculator.operator.Operation;

public class MultiplyOperator<T extends Number, Y extends Number> implements Operation<T, Y> {

    @Override
    public double operate(T firstNum, Y secondNum) {
        /* 구현 */
        return firstNum.doubleValue() * secondNum.doubleValue();
    }
}
