package calculator;

import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    static final double pi = 3.14;

    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Number> totalData;

    // 원의 넓이를 저장하는 필드
    private List<Double> circleAreaData;

    public Calculator (){
        this.totalData = new ArrayList<>();
        this.circleAreaData = new ArrayList<>();
    }

    public List<Number> getResult(){
        return totalData;
    }

    public void setResult(List<Number> totalData){
        this.totalData = totalData;
    }

    public void removeResult() {
        this.totalData.remove(0);
    }

    public void inquiryResults() {
        /* 구현 */
        String resultTotal = "연산결과 : ";
        for(Number totalNumber : this.totalData){
            resultTotal += totalNumber + ", ";
        }
        System.out.println(resultTotal);
    }

    public List<Double> getRadius(){
        return circleAreaData;
    }

    public void setRadius(List<Double> circleAreaData){
        this.circleAreaData = circleAreaData;
    }

    public abstract <T extends Number, Y extends Number> double calculate(T firstNum, Y secondNum, char operation) throws DivisionByZeroException, InvalidOperatorException;

    public abstract double calculateCircle(int r);

}


