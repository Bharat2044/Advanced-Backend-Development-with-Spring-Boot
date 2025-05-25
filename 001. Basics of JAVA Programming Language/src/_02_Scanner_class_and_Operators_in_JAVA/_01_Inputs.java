package _02_Scanner_class_and_Operators_in_JAVA;

import java.util.Scanner;

public class _01_Inputs {

    public static void main(String[] args) {

        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int num = input.nextInt();
        System.out.println("Number = " + num);

        System.out.print("Enter your marks: ");
        float marks = input.nextFloat();
        System.out.println("Marks = " + marks);

        System.out.print("Enter price: ");
        double price = input.nextDouble();
        System.out.println("Price = " + price);

        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Name = " + name);

    }
}
