package _07_Calculating_Fibonacci_Numbers;

public class _02_PrintFibonacciNumberUsingForLoop {

    public static void main(String[] args) {

        int n = 5;
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
