package lib;

public class UPIPayment implements Payment {
    
    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }
}