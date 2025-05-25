package _11_Functions_in_JAVA;

public class _04_TwoFunctionWithSameName {

    public static int addNumbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static int addNumbers(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void main(String[] args) {

        int res1 = addNumbers(10, 20);
        System.out.println(res1);

        int res2 = addNumbers(10, 20, 30);
        System.out.println(res2);
    }
}
