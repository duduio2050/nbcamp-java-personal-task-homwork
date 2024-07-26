package calculator.enums;

import calculator.exception.InvalidOperatorException;

public enum OperatorType {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    private char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType fromSymbol(char symbol) throws InvalidOperatorException {
        OperatorType returnType = null;
        for (OperatorType type : OperatorType.values()) {
            if (type.getSymbol() == symbol) {
                returnType = type;
            }
        }
        
        return returnType;
    }
}
