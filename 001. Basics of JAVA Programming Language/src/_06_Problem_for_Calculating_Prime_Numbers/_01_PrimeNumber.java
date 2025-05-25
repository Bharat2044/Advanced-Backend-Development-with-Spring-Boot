package _06_Problem_for_Calculating_Prime_Numbers;

public class _01_PrimeNumber {

    public static void main(String[] args) {

        int n = 7;
        int div = 2;
        int flag = 0;

        while (div <= n - 1) {
            if (n % div == 0) {
                flag = 1;
                break;
            }

            div++;
        }

        if (flag == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
