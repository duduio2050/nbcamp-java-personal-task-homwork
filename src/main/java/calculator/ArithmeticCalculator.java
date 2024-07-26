package calculator;

import calculator.operator.Operation;
import calculator.operator.OperatorFactory;

public class ArithmeticCalculator extends Calculator{

    Operation operator;

    OperatorFactory operatorFactory;

    public ArithmeticCalculator(OperatorFactory operatorFactory){
        this.operatorFactory = operatorFactory;
    }

    public int calculate(int firstNum, int secondNum, char operation){
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
