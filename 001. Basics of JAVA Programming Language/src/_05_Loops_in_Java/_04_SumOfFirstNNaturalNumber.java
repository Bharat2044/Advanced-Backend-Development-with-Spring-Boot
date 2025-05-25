package _05_Loops_in_Java;

public class _04_SumOfFirstNNaturalNumber {

    public static void main(String[] args) {

        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
