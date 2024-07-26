package calculator;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {

    private Map<Character, Operation> operations;

    public OperatorFactory() {
        operations = new HashMap<>();
        operations.put('+', new AddOperator());
        operations.put('-', new SubtractOperator());
        operations.put('*', new MultiplyOperator());
        operations.put('/', new DivideOperator());
        operations.put('%', new ModOperator());
    }

    public Operation getOperation(char symbol) {
        Operation op = operations.get(symbol);
        return op;
    }

}
