package _02_Scanner_class_and_Operators_in_JAVA;

public class _05_LogicalOperators {

    public static void main(String[] args) {

        // || - Logical AND Operator
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 < 3) && (8 > 5));

        // || - Logical OR Operator
        System.out.println((5 < 3) || (8 > 5));
        System.out.println((5 > 3) || (8 < 5));
        System.out.println((5 < 3) || (8 < 5));

        // ! - Logical NOT Operator
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));
    }
}
