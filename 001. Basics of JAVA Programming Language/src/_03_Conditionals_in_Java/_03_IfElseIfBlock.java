package _03_Conditionals_in_Java;

public class _03_IfElseIfBlock {

    public static void main(String[] args) {

        char hotstarSubs = 'S';

        if (hotstarSubs == 'N') {
            System.out.println("You don't have any Subscription");
        } else if (hotstarSubs == 'S') {
            System.out.println("You have super Subscription");
        } else if (hotstarSubs == 'P') {
            System.out.println("You have premium Subscription");
        } else {
            System.out.println("This looks like an invalid character");
        }
    }
}
