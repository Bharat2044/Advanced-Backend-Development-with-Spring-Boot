package _12_Arrays_in_JAVA;

public class _08_FindMaximumElementOfArray {

    public static int findMaxmumElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 200, 33, -4, 50 };

        int result = findMaxmumElement(arr);

        System.out.println(result);
    }
}
