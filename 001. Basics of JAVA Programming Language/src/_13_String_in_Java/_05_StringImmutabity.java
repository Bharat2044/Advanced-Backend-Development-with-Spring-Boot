package _13_String_in_Java;

public class _05_StringImmutabity {

    public static void main(String[] args) {

        String example1 = "Hello";
        example1 = example1.concat(" World");

        System.out.println(example1);
    }
}
