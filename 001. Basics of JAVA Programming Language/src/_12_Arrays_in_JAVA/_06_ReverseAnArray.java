package _12_Arrays_in_JAVA;

public class _06_ReverseAnArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void reverse(int[] arr) {

        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before reverse");
        printArray(arr);

        reverse(arr);

        System.out.println("After reverse");
        printArray(arr);
    }
}
