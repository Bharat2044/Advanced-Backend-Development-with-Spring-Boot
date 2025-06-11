package _16_User_Input_in_Java;

import java.util.Scanner;

public class _03_UserInputDemo3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        System.out.print("Enter Your Weight: ");
        float weight = input.nextFloat();

        System.out.println("Your Name: " + name);
        System.out.println("Your Age: " + age);
        System.out.println("Your Weight: " + weight);

        input.close();
    }
}
