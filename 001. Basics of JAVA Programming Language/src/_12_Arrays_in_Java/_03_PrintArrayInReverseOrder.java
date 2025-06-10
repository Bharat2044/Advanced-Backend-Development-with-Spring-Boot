package _12_Arrays_in_JAVA;

public class _03_PrintArrayInReverseOrder {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
