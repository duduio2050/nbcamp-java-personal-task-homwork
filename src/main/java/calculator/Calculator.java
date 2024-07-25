package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 원주율은 값이 무한대이고 변하지 않는 값이기 떄문에 함수로 생성하지 않고 저장합니다.
    static final double pi = 3.14;

    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Integer> totalData;

    // 원의 넓이를 저장하는 필드
    private List<Double> circleAreaData;

    public Calculator (){
        this.totalData = new ArrayList<>();
        this.circleAreaData = new ArrayList<>();
    }

    public int calculate(int firstNum, int secondNum, char operation) throws DivisionByZeroException, InvalidOperatorException {

        if(operation == '/'){
            if (secondNum == 0) {
                throw new DivisionByZeroException("분모는 0이 될 수 없습니다.");
            }
        }

        int total = 0;
        switch(operation){
            case '+':
                total = firstNum + secondNum;
                break;
            case '-':
                total = firstNum - secondNum;
                break;
            case '*':
                total = firstNum * secondNum;
                break;
            case '/':
                total = firstNum / secondNum;
                break;
        }
        /* return 연산 결과 */
        return total;
    }

    public List<Integer> getResult(){
        return totalData;
    }

    public void setResult(List<Integer> totalData){
        this.totalData = totalData;
    }

    public void removeResult() {
        this.totalData.remove(0);
    }

    public void inquiryResults() {
        /* 구현 */
        int count = 0;
        String resultTotal = "";
        for(Integer totalNumber : this.totalData){
            if(count == 0){
                resultTotal += "연산결과 : " + totalNumber;
            }else{
                resultTotal += ", " + totalNumber;
            }
            count++;
        }

        System.out.println(resultTotal);
    }

    public Double calculateCircleArea(int r){
        return pi * (r * r);
    }

    public List<Double> getRadius(){
        return circleAreaData;
    }

    public void setRadius(List<Double> circleAreaData){
        this.circleAreaData = circleAreaData;
    }

}


