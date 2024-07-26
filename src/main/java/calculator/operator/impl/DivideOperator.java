package calculator.operator.impl;

import calculator.exception.DivisionByZeroException;
import calculator.operator.Operation;

public class DivideOperator implements Operation {

    @Override
    public int operate(int firstNum, int secondNum) throws DivisionByZeroException{
        /* 구현 */

        if(secondNum == 0) {
            throw new DivisionByZeroException("분모는 0이 될 수 없습니다.");
        }

        return firstNum / secondNum;
    }
}
