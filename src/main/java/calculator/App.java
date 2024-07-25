package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InvalidOperatorException, DivisionByZeroException {

        // 연산결과 저장
//        ArrayList<Integer> resultArray = new ArrayList<>();

        // 인스턴스 생성
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

//        int count = 0;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            // Scanner 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int firstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int secondNum = sc.nextInt();

            while(secondNum == 0) {
                System.out.print("두번째 정수는 0 이 될 수 없습니다. 다시 입력해주세요 : ");
                // 0 인 경우 입력값 다시받기
                secondNum = sc.nextInt();
//                // 입력창 닫기
//                sc.close();
//                // 메서드 종료
//                return;
            }

            System.out.print("사칙연산 기호를 입력하세요 : ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            String inputSymbols = sc.next();
            char symbols = inputSymbols.charAt(0);

            while(symbols != '+' && symbols != '-' && symbols != '*' && symbols != '/'){
                System.out.print("올바른 연산 기호를 입력해주세요. 다시 입력해주세요 : ");
                inputSymbols = sc.next();
                symbols = inputSymbols.charAt(0);
            }

            // 현재 저장된 데이터를 불러옴
            List<Integer> calculatorArray = calculator.getResult();
            // 계산 결과 값
            Integer total = calculator.calculate(firstNum, secondNum, symbols);
            // 계산 결과 값을 가져온 필드 list 에 저장
            calculatorArray.add(total);
            // 필드에 저장
            calculator.setResult(calculatorArray);

            // 이부분에 해당코드가 있는 이유
            // 두번째 숫자를 입력하고 Enter를 쳤다면 10\이 존재한다.
            // 이때 nextInt()가 버퍼의 내용을 가져올 때 개행문자를 무시하고 가져오기 때문에 10만 가져오게 된다.
            // 그러면 버퍼에 \n이 남아있는데 nextLine()은 공백문자, 개행문자를 포함시키기 때문에 \n을 가져오게되고 다음 코드로 넘어가버리는 것이다.
            sc.nextLine();

            System.out.println("결과: " + total);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String remove = sc.nextLine();

            // 입력값 확인
            if (remove.equals("remove")){
                // 인덱스로 데이터 삭제
                // 해당 인덱스가 삭제되면 해당 인덱스가 다음 인덱스가 한칸 앞으로 자동으로 밀려남
                calculator.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
            String printAll = sc.nextLine();
            if(printAll.equals("inquiry")){
                // 그대로 출력하는 방법
//                System.out.println(resultArray.toString());
                int count = 0;
                String resultTotal = "";
                for(Integer totalNumber : calculatorArray){
                    if(count == 0){
                        resultTotal += "연산결과 : " + totalNumber;
                    }else{
                        resultTotal += ", " + totalNumber;
                    }
                    count++;
                }

                System.out.println(resultTotal);
            }


            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            // 다음 입력값 확인
            String exit = sc.nextLine();
            // 입력값이 exit 인지 확인
            if(exit.equals("exit")){
                // 입력창 닫기
                sc.close();
                // 메서드 종료
                return;
            }
        }
    }
}