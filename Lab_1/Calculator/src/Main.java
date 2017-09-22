import calculator.CalculatorIF;
import calculator.CalculatorPrototype;

public class Main {

    public static void main(String[] args) {
        CalculatorIF c = new CalculatorPrototype();
        assert c.sum(-1, -3) == -4;
        assert c.sum(5, 8) == 13;
        assert c.sum(5, -2) == 3;
        assert c.divide(3, 2) == 1;
        assert c.divide(4, 2) == 2;
        assert c.divide(10, 2) == 5;
        assert c.divide(11, 2) == 5;
        assert c.multiply(3, 4) == 12;
        assert c.multiply(5, 0) == 0;
        assert c.multiply(1, 5) == 5;
        assert c.multiply(42, 10) == 420;
    }
}
