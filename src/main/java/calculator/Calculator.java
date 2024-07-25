package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Integer> totalData = new ArrayList<>();

    public Integer calculate(int firstNum, int secondNum, char operation) throws DivisionByZeroException, InvalidOperatorException {

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
}


