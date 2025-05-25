package _05_Loops_in_Java;

import java.util.Scanner;

public class _05_ReverseANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;

            num /= 10;
        }

        System.out.println("After reversed Number = " + ans);
    }
}
