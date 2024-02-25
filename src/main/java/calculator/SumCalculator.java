package calculator;

public class SumCalculator {
    public static void main(String[] args) {
        //empty
    }
    public int sum(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("N must be greater than zero");
        }

        int value = 0;

        for (int i = 0; i <= n; i++) {
            value+=i;
        }
        return value;
    }

}
