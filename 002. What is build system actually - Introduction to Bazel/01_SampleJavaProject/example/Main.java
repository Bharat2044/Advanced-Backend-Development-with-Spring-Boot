package example;

import lib.Hello;
import lib.Payment;
import lib.UPIPayment;
import lib.CCPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the code execution...");

        Hello.sayHello();

        Payment p = new UPIPayment();
        p.pay();

        Payment p2 = new CCPayment();
        p2.pay();

        System.out.println("Ending the code execution.");
    }
}
