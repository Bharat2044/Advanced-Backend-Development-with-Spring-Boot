package _12_Arrays_in_JAVA;

public class _07_FindMinimumElementOfArray {

    public static int findMinimumElement(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10, 200, 33, -4, 50};

        int result = findMinimumElement(arr);

        System.out.println(result);
    }
}
