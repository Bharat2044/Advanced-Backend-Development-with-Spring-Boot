package _15_ArrayList_in_Java;

public class _05_RunningSumOf1dArray {

    public static int[] runningSum(int[] arr) {

        int[] result = new int[arr.length];

        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int result[] = runningSum(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
