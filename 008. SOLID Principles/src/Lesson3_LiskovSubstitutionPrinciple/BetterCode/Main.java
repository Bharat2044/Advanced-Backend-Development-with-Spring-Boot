package Lesson3_LiskovSubstitutionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();

        cards.add(new MasterCard());
        cards.add(new VisaCard());

        for (InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}
