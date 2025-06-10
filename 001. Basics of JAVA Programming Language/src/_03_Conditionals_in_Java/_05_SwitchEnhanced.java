package _03_Conditionals_in_Java;

public class _05_SwitchEnhanced {
    public static void main(String[] args) {

        int number = 48;

        String size = switch (number) {
            case 29 -> "Small";
            case 42 -> "Medium";
            case 48 -> "Large";
            case 50 -> "Extra Large";
            default -> "Unknown";
        };

        System.out.println("Size = " + size);
    }
}
