package _12_Arrays_in_JAVA;

public class _09_RotateAnArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        if (k < 0) {
            k = k + n;
        }

        for (int r = 1; r <= k; r++) {
            int temp = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;

        printArray(arr);

        rotate(arr, k);

        printArray(arr);
    }
}
