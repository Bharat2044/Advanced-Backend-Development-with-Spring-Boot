package _14_StringBuilder_in_Java;

public class _02_StringBuilderOperations {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");

        System.out.println(sb);

        // length()
        System.out.println(sb.length());

        // append
        sb.append("abc");
        System.out.println(sb);

        sb.append("def");
        System.out.println(sb);

        // insert()
        sb.insert(0, 'z');
        System.out.println(sb);

        sb.insert(sb.length(), 'z');
        System.out.println(sb);

        // setCharAt()
        sb.setCharAt(2, 'q');
        System.out.println(sb);

        // toString()
        String str = sb.toString();
        System.out.println(str);

        // reverse();
        sb.reverse();
        System.out.println(sb);
    }
}
