package _11_Functions_in_Java;

public class _07_Scoping {

    private static void swap(int one, int two) {
        System.out.println(one + ", " + two);

        int temp = one;
        one = two;
        two = temp;

        System.out.println(one + ", " + two);
    }

    public static void main(String[] args) {

        int one = 10, two = 20;

        System.out.println(one + ", " + two);
        swap(one, two);
        System.out.println(one + ", " + two);
    }
}
