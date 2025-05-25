package lib;

public class CCPayment implements Payment {
    
    @Override
    public void pay() {
        System.out.println("Paying using CC");
    }
}
