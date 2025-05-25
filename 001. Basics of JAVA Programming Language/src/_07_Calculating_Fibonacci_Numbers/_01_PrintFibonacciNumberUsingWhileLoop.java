package _07_Calculating_Fibonacci_Numbers;

public class _01_PrintFibonacciNumberUsingWhileLoop {

    public static void main(String[] args) {
        // Fibonacci Number -> 0 1 1 2 3 5 8 13 21 34...

        int n = 5;
        int a = 0, b = 1;

        int count = 1;

        while (count <= n) {
            System.out.println(a);

            int sum = a + b;
            a = b;
            b = sum;

            count++;
        }
    }
}
