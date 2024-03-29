package org.example.decorator;

import java.util.ArrayList;

public class CustomerOrder {
    private ArrayList<Food> foodItems = new ArrayList<>();
    private LoyaltyStatus loyaltyStatus;
    private String customerName;

    public CustomerOrder(String name, LoyaltyStatus loyaltyStatus) {
        this.customerName = name;
        this.loyaltyStatus = loyaltyStatus;
    }
    public void setLoyaltyStatus(LoyaltyStatus loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void addFoodToOrder(Food foodItem) {
        foodItems.add(foodItem);
    }

    public double getOrderCost() {
        double totalCost = 0.0;
        for (Food foodItem : foodItems) {
            totalCost += foodItem.getPrice();
        }
        if (loyaltyStatus != null) {
            totalCost = loyaltyStatus.applyDiscount(totalCost);
        }
        return totalCost;
    }

    public void printOrderDetail() {
        System.out.println("-------Order detail------");
        System.out.println("Customer name: " + this.customerName);
        for (Food foodItem : foodItems ) {
            System.out.println("*" + foodItem.getDetails() + ": " + foodItem.getPrice() + "$");
        }
        if(loyaltyStatus != null) {
            loyaltyStatus.printLoyaltyDetail();
        }
        System.out.println("Total: " + getOrderCost() + "$");
    }
}
