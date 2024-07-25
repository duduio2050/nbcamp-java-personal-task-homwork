package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    public ArithmeticCalculator(){
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    public int calculate(int firstNum, int secondNum, char operation){
        int total = 0;
        switch(operation){
            case '+':
                total = addOperator.operate(firstNum, secondNum);
                break;
            case '-':
                total = subtractOperator.operate(firstNum, secondNum);
                break;
            case '*':
                total = multiplyOperator.operate(firstNum, secondNum);
                break;
            case '/':
                total = divideOperator.operate(firstNum, secondNum);
                break;
        }
        /* return 연산 결과 */
        return total;

    }

    @Override
    public double calculateCircle(int r){
        throw new UnsupportedOperationException("지원하지 않습니다.");
    }


}
