package calculator;

public class ModOperator implements Operation{
    @Override
    public int operate(int firstNum, int secondNum) {
        /* 구현 */
        return firstNum % secondNum;
    }
}
