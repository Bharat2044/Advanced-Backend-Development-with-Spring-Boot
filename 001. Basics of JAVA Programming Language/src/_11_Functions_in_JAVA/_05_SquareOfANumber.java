package _11_Functions_in_JAVA;

public class _05_SquareOfANumber {

    private static int getSquare(int x) {

        return x * x;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            int result = getSquare(i);
            System.out.println("Square of " + i + " is " + result);
        }
    }
}
