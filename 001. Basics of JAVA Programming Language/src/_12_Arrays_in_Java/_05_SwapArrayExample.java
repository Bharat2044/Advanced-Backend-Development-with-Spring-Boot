package _12_Arrays_in_JAVA;

public class _05_SwapArrayExample {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        int[] arr2 = arr;
//        arr2[3] = 100;
//        System.out.println(arr[3]);

        int i = 0, j = 2;

        System.out.println("---------------CASE1---------------");
        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + ", " + arr[j]);

        System.out.println("---------------CASE2---------------");
        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr, i, j);
        System.out.println(arr[i] + ", " + arr[j]);

        System.out.println("---------------CASE3---------------");

        int[] brr = {100, 200, 300};
        System.out.println(arr[0] + ", " + brr[0]);
        swap(arr, brr);
        System.out.println(arr[0] + ", " + brr[0]);
    }

    private static void swap(int[] one, int[] two) {
        int[] temp = one;
        one = two;
        two = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int one, int two) {
        int temp = one;
        one = two;
        two = temp;
    }
}
