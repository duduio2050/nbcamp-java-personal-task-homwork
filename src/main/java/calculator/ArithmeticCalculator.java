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

    public int calculate(int firstNum, int secondNum, char operation) throws InvalidOperatorException, DivisionByZeroException {

        if (operation != '+' && operation != '-' && operation != '*' && operation != '/'){
            throw new InvalidOperatorException("올바른 연산 기호를 입력해주세요.");
        }

        operator = operatorFactory.getOperation(operation);
        int total = 0;
        total = operator.operate(firstNum, secondNum);
        /* return 연산 결과 */
        return total;

    }

    @Override
    public double calculateCircle(int r){
        throw new UnsupportedOperationException("지원하지 않습니다.");
    }


}
