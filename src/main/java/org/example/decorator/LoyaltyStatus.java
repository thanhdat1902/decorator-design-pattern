package org.example.decorator;

public class LoyaltyStatus {
    private LOYALTY_STATUS status = LOYALTY_STATUS.NO_MEMBERSHIP;
    private double discount = 0.0;
    public enum LOYALTY_STATUS {
        NO_MEMBERSHIP,
        GOLD,
        EXECUTIVE
    }
    public LoyaltyStatus(LOYALTY_STATUS status) {
        this.status = status;
        switch (status) {
            case LOYALTY_STATUS.NO_MEMBERSHIP:
                this.discount = 0.0;
                break;
            case LOYALTY_STATUS.GOLD:
                this.discount = 0.1;
                break;
            case LOYALTY_STATUS.EXECUTIVE:
                this.discount = 0.2;
                break;
            default:
                break;
        }
    }
    public double applyDiscount(double totalCost) {
        return totalCost - (totalCost * discount);
    }

    public void printLoyaltyDetail() {
        System.out.println("Current level loyalty: " + status);
        System.out.println("Discount: " + this.discount*100 + "%");
    }
}
