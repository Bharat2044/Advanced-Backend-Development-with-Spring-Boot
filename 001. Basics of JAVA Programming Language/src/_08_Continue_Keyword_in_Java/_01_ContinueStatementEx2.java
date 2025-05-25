package _08_Continue_Keyword_in_Java;

public class _01_ContinueStatementEx2 {

    public static void main(String[] args) {

        int i = 1, j = 1;

        while (i <= 3) {
            System.out.println("Outer Loop: " + i);

            while (j <= 3) {

                if (j == 2) {
                    j++;
                    continue;
                }

                System.out.println("Inner Loop: " + j);
                j++;
            }

            i++;
        }
    }
}
