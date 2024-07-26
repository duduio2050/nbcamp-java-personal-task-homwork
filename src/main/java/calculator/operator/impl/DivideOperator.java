package calculator.operator.impl;

import calculator.exception.DivisionByZeroException;
import calculator.operator.Operation;

public class DivideOperator<T extends Number, Y extends Number> implements Operation<T, Y> {

    @Override
    public double operate(T firstNum, Y secondNum) throws DivisionByZeroException{
        /* 구현 */

        if(secondNum.doubleValue() == 0) {
            throw new DivisionByZeroException("분모는 0이 될 수 없습니다.");
        }

        return firstNum.doubleValue() / secondNum.doubleValue();
    }
}
