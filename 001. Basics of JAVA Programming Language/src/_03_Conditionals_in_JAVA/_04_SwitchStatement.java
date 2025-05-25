package _03_Conditionals_in_JAVA;

public class _04_SwitchStatement {

    public static void main(String[] args) {

        int number = 48;
        String size;

        switch (number) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 48:
                size = "Large";
                break;
            case 50:
                size = "Extra Large";
                break;
            default:
                 size = "Unknown";
                 break;
        }

        System.out.println("Size = " + size);


        int expr = 2;

        switch (expr) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("default");
        }
    }
}
