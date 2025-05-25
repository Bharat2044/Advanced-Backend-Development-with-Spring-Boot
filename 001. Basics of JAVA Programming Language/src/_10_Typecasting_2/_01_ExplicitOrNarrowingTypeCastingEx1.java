package _10_Typecasting_2;

public class _01_ExplicitOrNarrowingTypeCastingEx1 {

    public static void main(String[] args) {

        int i = 20;
        float f = 3.14f;

        i = (int) f;

        System.out.println(i);
        System.out.println(f);

        byte b = (byte) 130;
        System.out.println(b);

        b = (byte) 380;
        System.out.println(b);
    }
}
