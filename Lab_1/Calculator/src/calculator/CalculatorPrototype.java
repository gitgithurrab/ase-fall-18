package calculator;

public class CalculatorPrototype implements CalculatorIF {

    @Override
    public int sum(int m, int n) {
        for (int c = Math.abs(n); c > 0; c--)
            m += n < 0 ? -1 : +1;
        return m;
    }

    @Override
    public int divide(int m, int n) {
        if (n == 0)
            throw new ArithmeticException("Division by zero");
        int d = 0;
        while (m > 0) {
            m -= n;
            d++;
        }
        return m == 0 ? d : d - 1;
    }

    @Override
    public int multiply(int m, int n) {
        int result = 0;
        for (int c = 1; c <= Math.abs(n); c++)
            result += m;
        return Integer.signum(m) * Integer.signum(n) * result;
    }

}
