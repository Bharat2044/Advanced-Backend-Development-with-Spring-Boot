package _09_Typecasting_in_Java;

public class _01_ImplicitOrWideningTypeCasting {

    public static void main(String[] args) {

        byte b = 5;
        short s = 10;
        int i = 8;
        long l = 7;

        s = b;
        i = b;
        l = b;

        // i = l; // Error

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        float f = 3.14f;
        double d = 6.7;

        // f = d // Error
        d = f;

        System.out.println(f);
        System.out.println(f);

        for (byte by = 0; by <= 128; by++) {
            System.out.println("Hello");
        }
    }
}
