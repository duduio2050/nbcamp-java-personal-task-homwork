package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator{

    @Override
    public <T extends Number, Y extends Number> double calculate(T firstNum, Y secondNum, char operation){
        throw new UnsupportedOperationException("지원하지 않습니다.");
    }

    @Override
    public double calculateCircle(int r){
        return pi * (r * r);
    }

}
