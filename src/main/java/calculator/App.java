package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 연산결과 저장
        int[] resultArray = new int[10];

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int firstNum = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
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

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            String inputSymbols = sc.next();
            char symbols = inputSymbols.charAt(0);

            while(symbols != '+' && symbols != '-' && symbols != '*' && symbols != '/'){
                System.out.print("올바른 연산 기호를 입력해주세요. 다시 입력해주세요 : ");
                inputSymbols = sc.next();
                symbols = inputSymbols.charAt(0);
            }

            int total = 0;
            switch(symbols){
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

            if(count == 10){
                for(int i = 0; i < 9; i++){
                    resultArray[i] =  resultArray[i+1];
                }

                resultArray[9] = total;
            }else{
                resultArray[count] = total;
                count++;
            }

            System.out.println("결과: " + total);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // 다음 입력값 확인
            String next = sc.next();
            // 입력값이 exit 인지 확인
            if(next.equals("exit")){
                // 입력창 닫기
                sc.close();
                // 메서드 종료
                return;
            }

        }
    }
}