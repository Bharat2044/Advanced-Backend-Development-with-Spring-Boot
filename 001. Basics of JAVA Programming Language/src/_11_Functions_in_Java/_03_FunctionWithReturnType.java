package _11_Functions_in_JAVA;

public class _03_FunctionWithReturnType {

    public static int addNumbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        int res = addNumbers(10, 20);
        System.out.println(res);
    }
}
