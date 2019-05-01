package oop;

public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        }
        return (long) Math.pow(n, p);
    }
}
