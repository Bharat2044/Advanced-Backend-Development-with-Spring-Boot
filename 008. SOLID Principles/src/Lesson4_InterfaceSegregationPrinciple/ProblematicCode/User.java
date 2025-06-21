package Lesson4_InterfaceSegregationPrinciple.ProblematicCode;

public interface User {

    boolean canBuyProducts();

    boolean canModifyProducts();

    boolean canAddProducts();

    boolean canApproveProducts();

    void approveProduct();
}
