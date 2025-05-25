package _06_Problem_for_Calculating_Prime_Numbers;

public class _02_BreakStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i % 5 == 0) {
                break;
            }
        }
    }
}
