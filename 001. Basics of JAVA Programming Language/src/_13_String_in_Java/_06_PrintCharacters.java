package _13_String_in_Java;

public class _06_PrintCharacters {

    public static void main(String[] args) {

        String str = "Hello";

        char ch = str.charAt(0);
        System.out.println(ch);

        System.out.println(str.charAt(1));
        System.out.println(str.charAt(str.length() - 1));

        System.out.println("------------------");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
