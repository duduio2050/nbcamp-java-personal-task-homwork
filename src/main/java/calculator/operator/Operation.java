package calculator.operator;

import calculator.exception.DivisionByZeroException;

public interface Operation{
    int operate(int a, int b) throws DivisionByZeroException;
}
