package _16_User_Input_in_Java;

import java.util.Scanner;

public class _02_UserInputDemo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = input.nextInt();

        System.out.println("You Entered: " + num);

//        System.out.print("Enter Text: ");
//        String myString = input.next();

//        System.out.println("You Entered: " + myString);

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        System.out.println("You Entered: " + name);

        input.close();
    }
}
