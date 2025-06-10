package _02_Scanner_class_and_Operators_in_Java;

public class _06_UnaryOperators {

    public static void main(String[] args) {

        int num = 5;
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num--);
        System.out.println(--num);

        int a = 12, b = 12;
        int res1, res2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        res1 = ++a;
        System.out.println("res1 = " + res1);
        System.out.println("a = " + a);

        res2 = --b;
        System.out.println("res2 = " + res2);
        System.out.println("b = " + b);

        res1 = a++;
        System.out.println("res1 = " + res1);
        System.out.println("a = " + a);

        res2 = b--;
        System.out.println("res2 = " + res2);
        System.out.println("b = " + b);
    }
}
