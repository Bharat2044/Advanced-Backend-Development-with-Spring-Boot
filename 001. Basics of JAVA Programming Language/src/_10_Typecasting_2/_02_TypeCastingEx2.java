package _10_Typecasting_2;

public class _02_TypeCastingEx2 {

    public static void main(String[] args) {

        char ch = 'a';
        int i = ch;

        System.out.println(i);
        System.out.println(ch);
        System.out.println((int) ch);

        ch = 70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch = (char) (ch + 1);
        System.out.println(ch);

        ch = 'a' + 1;
        ch = (char) ('a' + ch);
        System.out.println(ch);
        System.out.println((int) ch);
    }
}
