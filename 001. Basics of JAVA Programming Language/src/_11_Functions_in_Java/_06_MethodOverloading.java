package _11_Functions_in_Java;

public class _06_MethodOverloading {

    public static String formatNumber(int value) {

        return String.format("%d", value);
    }

    public static String formatNumber(double value) {

        return String.format("%.3f", value);
    }

    public static String formatNumber(String value) {

        return String.format("%.2f", Double.parseDouble(value));
    }

    public static int addNumbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static int addNumbers(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(formatNumber(500));
        System.out.println(formatNumber(89.996734));
        System.out.println(formatNumber("550"));

        System.out.println(addNumbers(10, 20));
        System.out.println(addNumbers(10, 20, 30));
    }
}
