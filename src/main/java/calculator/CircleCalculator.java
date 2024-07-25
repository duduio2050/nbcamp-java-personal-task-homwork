package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator{

    public int calculate(int firstNum, int secondNum, char operation){
        throw new UnsupportedOperationException("지원하지 않습니다.");
    }

    @Override
    public double calculateCircle(int r){
        return pi * (r * r);
    }

}
