package _16_User_Input_in_Java;

import java.util.Scanner;

public class _01_UserInputDemo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = input.nextInt();

        System.out.println("You Entered: " + num);

        input.close();
    }
}
