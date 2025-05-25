package _11_Functions_in_JAVA;

public class _08_ArmstrongNumber {

    private static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static boolean isArmstrong(int num) {

        int nod = countDigits(num);
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;

            sum += Math.pow(rem, nod);
            num /= 10;
        }

        return (originalNum == sum);
    }

    public static void printArmstrongNumbers(int low, int high) {

        System.out.println("All Armstrong Numbers from " + low + " to " + high);
        for (int i = low; i <= high; i++) {

            boolean result = isArmstrong(i);

            if (result) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // abc -> a^3 + b^3 + c^3
        // 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27 = 153

        System.out.println(isArmstrong(1));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(145));

        printArmstrongNumbers(1, 10000);
    }
}
