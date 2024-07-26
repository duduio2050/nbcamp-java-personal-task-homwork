package calculator;

import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;
import calculator.operator.Operation;
import calculator.operator.OperatorFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    // collect 타입의 calculatorArray 데이터 안에서 total 값보다 큰 값을 추출하여 string 형태로 변환 후 return
    public String search(List<Number> calculatorArray, double total) {
        // 기존코드는 간단해서 좀 꼬아봤습니다.
//        return calculatorArray.stream().filter(calculator -> calculator.intValue() > total).map(Object::toString).collect(Collectors.joining(","));

        List<Number> list = new ArrayList<>();

        calculatorArray.stream()
                // 내림차순 정렬
                .sorted((a, b) -> Double.compare(b.doubleValue(), a.doubleValue()))

                // 반복문으로
                .forEach(item -> {
                    if (item.intValue() > total) {
                        list.add(item.intValue());
                    }
                });

        return list.stream().map(Object::toString)
                .collect(Collectors.joining(","));

    }

}
