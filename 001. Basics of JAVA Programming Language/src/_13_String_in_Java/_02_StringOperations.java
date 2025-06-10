package _13_String_in_Java;

public class _02_StringOperations {

    public static void main(String[] args) {

        String first = "Java";
        String second = "Python";
        String third = "Java";

        String greet = "Hello World";
        System.out.println("String: " + greet);

        // Print Length of the String
        System.out.println("length: " + greet.length());

        // Print First and Last Character of the String
        System.out.println("First Character: " + greet.charAt(0));
        System.out.println("Last Character: " + greet.charAt(greet.length()-1));

        // Join Two Strings
        System.out.println(first.concat(second));
        System.out.println(first + second);

        // Compare Two Strings
        boolean res1 = first.equals(second);
        System.out.println(res1);

        boolean res2 = first.equals(third);
        System.out.println(res2);

        System.out.println(first == second);
        System.out.println(first == third);

        String name1 = new String("Program1");
        String name2 = new String("Program1");

        boolean result1 = (name1 == name2);
        boolean result2 = name1.equals(name2);

        System.out.println(result1);
        System.out.println(result2);

        String n1 = "Program2";
        String n2 = n1;

        boolean r1 = (n1 == n2);
        boolean r2 = n1.equals(n2);

        System.out.println(r1 + "  " + r2);

        String str = "Hello World";

        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l", 5));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l", 5));

        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("llo"));
        System.out.println(str.endsWith("World"));
    }
}
