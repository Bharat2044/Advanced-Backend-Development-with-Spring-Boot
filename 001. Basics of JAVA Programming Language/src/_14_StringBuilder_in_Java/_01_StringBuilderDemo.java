package _14_StringBuilder_in_Java;

public class _01_StringBuilderDemo {

    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder sb1 = new StringBuilder(str);

        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello World");
        System.out.println(sb2);
    }
}
