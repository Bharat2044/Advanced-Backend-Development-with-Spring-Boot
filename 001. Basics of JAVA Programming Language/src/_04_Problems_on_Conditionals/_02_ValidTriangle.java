package _04_Problems_on_Conditionals;

import java.util.Scanner;

public class _02_ValidTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        if (sum == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
