package _08_Continue_Keyword_in_Java;

public class _01_ContinueStatementEx1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i > 4 && i < 9) {
                continue;
            }

            System.out.println(i);
        }
    }
}
