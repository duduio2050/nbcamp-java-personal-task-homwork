package calculator.operator;

import calculator.enums.OperatorType;
import calculator.exception.InvalidOperatorException;
import calculator.operator.impl.ModOperator;
import calculator.operator.impl.AddOperator;
import calculator.operator.impl.DivideOperator;
import calculator.operator.impl.MultiplyOperator;
import calculator.operator.impl.SubtractOperator;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {

    public Operation getOperation(char symbol) throws InvalidOperatorException {
        OperatorType operator = OperatorType.fromSymbol(symbol);
        switch (operator) {
            case ADD:
                return new AddOperator();
            case SUBTRACT:
                return new SubtractOperator();
            case MULTIPLY:
                return new MultiplyOperator();
            case DIVIDE:
                return new DivideOperator();
            case MOD:
                return new ModOperator();
            default:
                throw new InvalidOperatorException("올바른 연산 기호를 입력해주세요.");
        }
    }

}
