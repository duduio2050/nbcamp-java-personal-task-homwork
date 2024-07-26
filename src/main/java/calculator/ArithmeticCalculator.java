package calculator;

import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;
import calculator.operator.Operation;
import calculator.operator.OperatorFactory;

public class ArithmeticCalculator extends Calculator{

    Operation operator;

    OperatorFactory operatorFactory;

    public ArithmeticCalculator(OperatorFactory operatorFactory){
        this.operatorFactory = operatorFactory;
    }

    @Override
    public <T extends Number, Y extends Number> double calculate(T firstNum, Y secondNum, char operation) throws  InvalidOperatorException, DivisionByZeroException {

        operator = operatorFactory.getOperation(operation);
        double total = operator.operate(firstNum, secondNum);
        /* return 연산 결과 */
        return total;

    }

    @Override
    public double calculateCircle(int r){
        throw new UnsupportedOperationException("지원하지 않습니다.");
    }


}
