package _09_Typecasting_in_Java;

public class _02_ExplicitOrNarrowingTypeCasting {

    public static void main(String[] args) {

        int i = 20;
        float f = 3.14f;

        i = (int) f;

        System.out.println(i);
        System.out.println(f);

        byte b = (byte) 130;
        System.out.println(b);
    }
}
