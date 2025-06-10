package _13_String_in_Java;

public class
_03_StringComparison {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println((s1 == s2) + " , " + s1.equals(s2));
        System.out.println((s2 == s3) + " , " + s2.equals(s3));
        System.out.println((s1 == s3) + " , " + s1.equals(s3));
        System.out.println((s1 == s4) + " , " + s1.equals(s4));
    }
}
