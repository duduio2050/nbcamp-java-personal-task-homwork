package calculator.operator;

import calculator.exception.DivisionByZeroException;

public interface Operation<T, Y>{
    double operate(T a, Y b) throws DivisionByZeroException;
}
