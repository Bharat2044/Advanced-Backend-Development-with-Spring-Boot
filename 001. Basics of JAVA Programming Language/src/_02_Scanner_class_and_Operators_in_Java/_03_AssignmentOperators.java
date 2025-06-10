package _02_Scanner_class_and_Operators_in_Java;

public class _03_AssignmentOperators {

    public static void main(String[] args) {

        int age;
        age = 22;

        System.out.println("Age = " + age);

        int val = age;
        System.out.println("Value = " + val);

        int a = 20;
        val += a;
        System.out.println("Value = " + val);

        val -= 10;
        System.out.println("Value = " + val);

        val *= a;
        System.out.println("Value = " + val);

        val /= 2;
        System.out.println("Value = " + val);

        val %= a;
        System.out.println("Value = " + val);
    }
}
